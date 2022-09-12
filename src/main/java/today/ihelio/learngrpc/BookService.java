package today.ihelio.learngrpc;

import com.google.protobuf.ByteString;
import io.grpc.Context;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import today.ihelio.grpc.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Logger;

import static java.util.logging.Level.SEVERE;

/**
 * @author helio
 * @date 2022/9/3
 * @package today.ihelio.learngrpc
 */
public class BookService extends BookServiceGrpc.BookServiceImplBase {
    private static final Logger logger = Logger.getLogger(BookService.class.getName());
    private BookStore bookStore;
    private ImageStore imageStore;

    public BookService(BookStore bookStore, ImageStore imageStore) {
        this.bookStore = bookStore;
        this.imageStore = imageStore;
    }

    @Override
    public StreamObserver<RateBookRequest> rateBook(StreamObserver<RateBookResponse> responseObserver) {
        return new StreamObserver<RateBookRequest>() {
            @Override
            public void onNext(RateBookRequest request) {
                String bookID = request.getBookId();
                Integer rating = request.getRating();
                Book book = bookStore.RateBook(bookID, rating);
                RateBookResponse response = RateBookResponse.newBuilder()
                        .setBookId(book.getId())
                        .setRatingCount(book.getRatingCount())
                        .setAvgRating(book.getAvgRating())
                        .build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                logger.log(SEVERE, "rating failed " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                logger.info("rating finished");
            }
        };
    }

    @Override
    public void recommendBook(RecommendBookRequest request, StreamObserver<RecommendBookResponse> responseObserver) {
        Integer popularity = request.getPopularity();

        logger.info("checked all books with popularity greater than " + popularity);
        bookStore.SearchBook(Context.current(), popularity, new BookStream() {
            @Override
            public void Send(String bookID) {
                logger.info("found book: " + bookID);
                RecommendBookResponse response = RecommendBookResponse.newBuilder().setBookId(bookID).build();
                responseObserver.onNext(response);
            }
        });
        responseObserver.onCompleted();
        logger.info("finished book recommendation!");

    }

    @Override
    public StreamObserver<UploadImageRequest> uploadImage(StreamObserver<UploadImageResponse> responseObserver) {
        return new StreamObserver<UploadImageRequest>() {
            private String bookID;
            private ImageInfo info;
            private ByteArrayOutputStream imageData;

            @Override
            public void onNext(UploadImageRequest request) {
                if (request.getDataCase() == UploadImageRequest.DataCase.INFO) {
                    info = request.getInfo();
                    logger.info("receive image info:\n" + info);

                    bookID = info.getBookId();
                    imageData = new ByteArrayOutputStream();

                    Book found = bookStore.findBook(bookID);
                    if (found == null) {
                        responseObserver.onError(
                                Status.NOT_FOUND
                                        .withDescription("Book not found")
                                        .asRuntimeException()
                        );
                    }
                    return;
                }

                ByteString chunkData = request.getChunkData();

//                logger.info("receive image chunk with size: " + chunkData.size());

                if (imageData == null) {
                    logger.info("image info wasn't sent before");
                    responseObserver.onError(
                            Status.INVALID_ARGUMENT
                                    .withDescription("image info wasn't sent before")
                                    .asRuntimeException()
                    );
                    return;
                }

                try {
                    chunkData.writeTo(imageData);
                } catch (IOException e) {
                    responseObserver.onError(
                            Status.INTERNAL
                            .withDescription("cannot write chunk data: " + e.getMessage())
                                    .asRuntimeException());
                }
            }

            @Override
            public void onError(Throwable t) {
                logger.warning(t.getMessage());
            }

            @Override
            public void onCompleted() {
                String imageID = "";
                int imageSize = imageData.size();
                try {
                    imageID = imageStore.Save(bookID, info, imageData);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                UploadImageResponse response = UploadImageResponse.newBuilder()
                        .setId(imageID)
                        .setSize(imageSize)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void createBook(CreateBookRequest request, StreamObserver<CreateBookResponse> responseObserver) {
        Book book = request.getBook();
        String id = book.getId();
        logger.info("Received request to create a new book with ID: " + id);
        UUID uuid;
        if (id.isEmpty()) {
            uuid = UUID.randomUUID();
        } else {
            try {
                uuid = UUID.fromString(id);
            } catch (IllegalArgumentException e) {
                responseObserver.onError(
                        Status.INVALID_ARGUMENT
                                .withDescription(e.getMessage())
                                .asRuntimeException()
                );
                return;
            }
        }

        if (Context.current().isCancelled()) {
            logger.info("request is cancelled");
            responseObserver.onError(
                    Status.CANCELLED
                            .withDescription("request is cancelled")
                            .asRuntimeException());
        }
        Book copy = book.toBuilder().setId(uuid.toString()).build();
        try {
            bookStore.createBook(copy);
        } catch (AlreadyExistsException e) {
            responseObserver.onError(
                    Status.ALREADY_EXISTS
                            .withDescription(e.getMessage())
                            .asRuntimeException()
            );
        }

        CreateBookResponse response = CreateBookResponse.newBuilder().setId(copy.getId()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        logger.info(String.format("book %s created", copy.getName()));
    }
}

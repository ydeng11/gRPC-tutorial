package today.ihelio.learngrpc;

import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import today.ihelio.grpc.*;
import today.ihelio.sample.Generator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.concurrent.TimeUnit.SECONDS;
import static java.util.logging.Level.SEVERE;

/**
 * @author helio
 * @date 2022/9/3
 * @package today.ihelio.learngrpc
 */
public class BookClient {

    private static final Logger logger = Logger.getLogger(BookClient.class.getName());

    private final ManagedChannel channel;

    private final BookServiceGrpc.BookServiceBlockingStub blockingStub;

    private final BookServiceGrpc.BookServiceStub asyncStub;

    private static final Random rand = new Random();

    public BookClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        blockingStub = BookServiceGrpc.newBlockingStub(channel);
        asyncStub = BookServiceGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, SECONDS);
    }

    public void createBook(Book book) throws InterruptedException {
        CreateBookRequest request = CreateBookRequest.newBuilder().setBook(book).build();
        CreateBookResponse response = CreateBookResponse.getDefaultInstance();

        try {
            response = blockingStub.withDeadlineAfter(5, SECONDS).createBook(request);

            for (Image image : book.getImageList()) {
                new Thread(
                    () -> {
                        try {
                            uploadImage(book.getId(), image);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    ).start();
            }

        } catch (StatusRuntimeException e) {
            if (e.getStatus().getCode() == Status.Code.ALREADY_EXISTS) {
                logger.info("Book already exists");
                return;
            }
        } catch (Exception e) {
            logger.log(SEVERE, "request failed " + e.getMessage());
        }
        logger.info("New book created: \n" + response.getId());
    }

    public void uploadImage(String bookID, Image image) throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
// we use asyncStub instead of blockingStub for streaming connection
        StreamObserver<UploadImageRequest> requestObserver = asyncStub.withDeadlineAfter(5, SECONDS)
                .uploadImage(new StreamObserver<UploadImageResponse>() {
                    @Override
                    public void onNext(UploadImageResponse response) {
                        logger.info("receive response:\n" + response);
                    }

                    @Override
                    public void onError(Throwable t) {
                        logger.log(SEVERE, "upload failed: " + t);
                        latch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        logger.info("image uploaded");
                        latch.countDown();
                    }
                });
        FileInputStream fileInputStream;
        String imagePath;
        try {
            imagePath = image.getFilePath();
            fileInputStream = new FileInputStream(imagePath);
        } catch (FileNotFoundException e) {
            logger.log(SEVERE, "cannot read image file: " + e.getMessage());
            return;
        }

        String imageType = imagePath.substring(imagePath.lastIndexOf("."));
        String fileName = imagePath.substring(imagePath.lastIndexOf("/"));
        ImageInfo info = ImageInfo.newBuilder()
                .setBookId(bookID)
                .setImageType(imageType)
                .setFileName(fileName)
                .build();
        UploadImageRequest request = UploadImageRequest.newBuilder().setInfo(info).build();

        try {
            requestObserver.onNext(request);
            logger.info("send image info:\n" + info);

            byte[] buffer = new byte[1024];
            while (true) {
                int n = fileInputStream.read(buffer);
                if (n <= 0) {
                    break;
                }

                if (latch.getCount() == 0) {
                    return;
                }
                request = UploadImageRequest.newBuilder()
                        .setChunkData(ByteString.copyFrom(buffer))
                        .build();
                requestObserver.onNext(request);
            }
        } catch (Exception e) {
                logger.log(SEVERE, "unexpected error: " + e.getMessage());
            }
        requestObserver.onCompleted();

        if (!latch.await(1, TimeUnit.MINUTES)) {
            logger.warning("request cannot finish within 1 minute");
        }
    }

    public void recommendBook(Integer popularity) {
        logger.info("search started");
        RecommendBookRequest request = RecommendBookRequest.newBuilder()
                .setPopularity(rand.nextInt(100))
                .build();

        try {
            Iterator<RecommendBookResponse> iterator = blockingStub
                    .withDeadlineAfter(5, SECONDS)
                    .recommendBook(request);

            while (iterator.hasNext()) {
                RecommendBookResponse response = iterator.next();
                logger.info("found: " + response.getBookId());
            }
        } catch (Exception e) {
            logger.log(SEVERE, "request failed: " + e.getMessage());
            return;
        }
        logger.info("recommendation completed!");

    }

    public void rateBook(String[] bookIDs, Integer[] ratings) throws InterruptedException {
        CountDownLatch finishLatch = new CountDownLatch(1);
        logger.info("rating started");
        StreamObserver<RateBookRequest> requestObserver = asyncStub
                .rateBook(new StreamObserver<RateBookResponse>() {
                    @Override
                    public void onNext(RateBookResponse response) {
                        logger.info(String.format("laptop rated: id = %s, count = %s, avg = %s",
                                response.getBookId(),
                                response.getRatingCount(),
                                response.getAvgRating()));
                    }

                    @Override
                    public void onError(Throwable t) {
                        logger.log(SEVERE, "rating failed: " + t.getMessage());
                        finishLatch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        logger.info("rate laptop completed");
                        finishLatch.countDown();
                    }
                });

        int n = bookIDs.length;
        try {
            for (int i = 0; i < n; i++) {
                RateBookRequest request = RateBookRequest.newBuilder()
                        .setBookId(bookIDs[i])
                        .setRating(ratings[i])
                        .build();
                requestObserver.onNext(request);
                logger.info("sent rate-book request: id = " + request.getBookId() + ", score = " + request.getRating());
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "unexpected error: " + e.getMessage());
            requestObserver.onError(e);
            return;
        }

        requestObserver.onCompleted();
        if (!finishLatch.await(1, TimeUnit.MINUTES)) {
            logger.warning("request cannot finish within 1 minute");
        }

    }

    public static void testCreateBook(BookClient client, Generator generator) throws InterruptedException {
        Book book = generator.createRandomBook();
        client.createBook(book);
    }

    public static void testRecommendBook(BookClient client, Integer popularity) {
        client.recommendBook(popularity);
    }

    public static void testRateBook(BookClient client, Generator generator) throws InterruptedException {
        int n = 3;
        String[] bookIDs = new String[n];
        for (int i = 0; i < n; i++) {
            Book book = generator.createRandomBook();
            bookIDs[i] = book.getId();
            client.createBook(book);
        }

        Integer[] scores = new Integer[n];
        for (int i = 0; i < n; i++) {
            scores[i] = rand.nextInt(10);
        }

        client.rateBook(bookIDs, scores);
    }

    public static void main(String[] args) throws InterruptedException {
        BookClient client = new BookClient("0.0.0.0", 9080);
        Generator generator = new Generator();

        try {
            testRateBook(client, generator);
//            testRecommendBook(client, new Random().nextInt(100));
        } finally {
            client.shutdown();
        }
    }

}

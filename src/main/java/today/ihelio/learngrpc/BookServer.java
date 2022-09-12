package today.ihelio.learngrpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @author helio
 * @date 2022/9/3
 * @package today.ihelio.learngrpc
 */
public class BookServer {
    private final Logger logger = Logger.getLogger(BookServer.class.getName());
    private BookService bookService;
    private final int port;
    private final Server server;

    public BookServer(int port, BookStore bookStore, ImageStore imageStore) {
        this(ServerBuilder.forPort(port), port, bookStore, imageStore);
    }

    public BookServer(ServerBuilder serverBuilder, int port, BookStore bookStore, ImageStore imageStore) {
        this.port = port;
        this.bookService = new BookService(bookStore, imageStore);
        this.server = serverBuilder.addService(bookService)
                .addService(ProtoReflectionService.newInstance())
                .build();
    }

    public void start() throws IOException {
        server.start();
        logger.info("Book server started on port " + port);

        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.err.println("shutdown gRPC server because JVM shuts down");
                try {
                    BookServer.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.err.println("server shutdown");
            }
        });
    }

    public void stop() throws InterruptedException{
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException{
        InMemoryBookStore inMemoryBookStore = new InMemoryBookStore();
        DiskImageStore diskImageStore = new DiskImageStore("src/main/resources/images_destination");
        BookServer server = new BookServer(9080, inMemoryBookStore, diskImageStore);
        server.start();
        server.blockUntilShutdown();
    }

}

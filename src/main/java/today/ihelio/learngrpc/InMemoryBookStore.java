package today.ihelio.learngrpc;

import io.grpc.Context;
import io.grpc.Status;
import io.grpc.xds.shaded.io.envoyproxy.envoy.config.accesslog.v3.GrpcStatusFilter;
import org.checkerframework.checker.units.qual.C;
import today.ihelio.grpc.Book;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static io.grpc.Status.NOT_FOUND;

/**
 * @author helio
 * @date 2022/9/3
 * @package today.ihelio.learngrpc
 */
public class InMemoryBookStore implements BookStore{

    private final Logger logger = Logger.getLogger(InMemoryBookStore.class.getName());
    ConcurrentMap<String, Book> inMemoryBookStore;

    @Override
    public Book rateBook(String bookID, Integer rating) {
        Book book = inMemoryBookStore.getOrDefault(bookID, null);
        if (book == null) {
            throw NOT_FOUND.withDescription("book not found")
                    .asRuntimeException();
        }
        inMemoryBookStore.computeIfPresent(bookID, (k, v) -> {
            Integer oldRating = v.getRating();
            Integer oldCount = v.getRatingCount();
            return v.toBuilder()
                    .setRating(rating + oldRating)
                    .setRatingCount(oldCount + 1)
                    .setAvgRating((rating + oldRating)/(float) (oldCount + 1))
                    .build();
        });
        return inMemoryBookStore.get(bookID);
    }

    public InMemoryBookStore() {
        this.inMemoryBookStore = new ConcurrentHashMap<>();
    }

    @Override
    public Book findBook(String bookID) {
        return inMemoryBookStore.getOrDefault(bookID, null);
    }

    @Override
    public void searchBook(Context ctx, Integer popularity, BookStream bookStream) {
        for (Map.Entry<String, Book> entry : inMemoryBookStore.entrySet()) {
            if (ctx.isCancelled()) {
                logger.info("context is cancelled");
                return;
            }

            Book book = entry.getValue();
            if (book.getPopularity() >= popularity) {
                bookStream.send(book.getId());
            }
        }
    }

    @Override
    public void createBook(Book book) {
        if (inMemoryBookStore.containsKey(book.getId())) {
            throw new AlreadyExistsException("book already exists");
        } else {
            inMemoryBookStore.put(book.getId(), book);
        }
    }
}

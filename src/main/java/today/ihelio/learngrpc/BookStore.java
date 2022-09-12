package today.ihelio.learngrpc;

import io.grpc.Context;
import today.ihelio.grpc.Book;

/**
 * @author helio
 * @date 2022/9/3
 * @package today.ihelio.learngrpc
 */
public interface BookStore {
    void createBook(Book book);

    Book findBook(String bookID);

    void SearchBook(Context current, Integer popularity, BookStream bookStream);

    Book RateBook(String bookID, Integer rating);
}

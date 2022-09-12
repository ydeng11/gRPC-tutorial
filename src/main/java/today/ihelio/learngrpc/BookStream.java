package today.ihelio.learngrpc;

/**
 * @author helio
 * @date 2022/9/5
 * @package today.ihelio.learngrpc
 */
public interface BookStream {
    void Send(String bookID);
}

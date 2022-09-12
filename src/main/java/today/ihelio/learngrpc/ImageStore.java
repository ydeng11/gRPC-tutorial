package today.ihelio.learngrpc;

import today.ihelio.grpc.Image;
import today.ihelio.grpc.ImageInfo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author helio
 * @date 2022/9/4
 * @package today.ihelio.learngrpc
 */
public interface ImageStore {
    String Save(String bookID, ImageInfo info, ByteArrayOutputStream imageData) throws IOException;
}

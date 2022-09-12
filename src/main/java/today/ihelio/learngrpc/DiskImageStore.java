package today.ihelio.learngrpc;

import today.ihelio.grpc.Image;
import today.ihelio.grpc.ImageInfo;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import static com.google.protobuf.util.Timestamps.fromMillis;
import static java.lang.System.currentTimeMillis;

/**
 * @author helio
 * @date 2022/9/4
 * @package today.ihelio.learngrpc
 */
public class DiskImageStore implements ImageStore{

    ConcurrentMap<String, ConcurrentMap<String,Image>> store;
    private String imageFolder;

    public DiskImageStore(String imageFolder) {
        this.store = new ConcurrentHashMap<>();
        this.imageFolder = imageFolder;
    }

    @Override
    public String Save(String bookID, ImageInfo info, ByteArrayOutputStream imageData) throws IOException {
        String imageName = info.getFileName();
        String imageID = UUID.nameUUIDFromBytes(imageName.getBytes()).toString();
        if (store.containsKey(bookID)) {
            if (store.get(bookID).containsKey(imageID)) {
                throw new AlreadyExistsException("image %s already existed for book %s".formatted(imageName, bookID));
            }
        } else {
            store.put(bookID, new ConcurrentHashMap<>());
        }

        String imagePath = String.format("%s/%s", imageFolder, imageName);

        FileOutputStream fileOutputStream = new FileOutputStream(imagePath);
        imageData.writeTo(fileOutputStream);
        fileOutputStream.close();

        Image image = Image.newBuilder()
                .setId(imageID)
                .setFilePath(imagePath)
                .setUploadedAt(fromMillis(currentTimeMillis()))
                .build();

        store.get(bookID).put(imageID, image);

        return image.getId();
    }
}

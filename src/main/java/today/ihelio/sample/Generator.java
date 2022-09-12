package today.ihelio.sample;

import today.ihelio.grpc.Book;
import today.ihelio.grpc.Image;
import today.ihelio.grpc.Sample;

import java.util.*;

import static com.google.protobuf.util.Timestamps.fromMillis;
import static java.lang.System.currentTimeMillis;

/**
 * @author helio
 * @date 2022/9/3
 * @package today.ihelio.sample
 */
public class Generator {
    String[] genreList = new String[]{
        "FICTION",
        "MYSTERY",
        "THRILLER",
        "HORROR",
        "HISTORICAL",
        "ROMANCE",
        "SCI_FICTION",
    };
    private final Random rand;
    public Generator() {
        rand = new Random();
    }

    private String generateRandomWords(int lengthofWords)
    {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
            // words of length 3 through 10. (1 and 2 letter words are boring.)
        for(int j = 0; j < lengthofWords; j++)
        {
            sb.append((char)('a' + random.nextInt(26)));
            if (rand.nextInt(10) == 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public String randomAuthor() {
        return generateRandomWords(10);
    }

    public String randomName() {
        return generateRandomWords(20);
    }

    public String randomPublication() {
        return generateRandomWords(8);
    }

    public Sample randomSample() {
        return Sample.newBuilder()
                .setParagraph(
                        generateRandomWords(new Random().nextInt(20, 30))
                ).build();
    }

    public Image getImage(String filepath) {
        return Image.newBuilder()
                .setId(UUID.nameUUIDFromBytes(filepath.getBytes()).toString())
                .setFilePath(filepath)
                .setUploadedAt(fromMillis(currentTimeMillis()))
                .build();
    }

    public Book.Genre randomGenre() {
        String genre = genreList[rand.nextInt(genreList.length)];
        if ("FICTION".equals(genre)) {
            return Book.Genre.FICTION;
        } else if ("MYSETRY".equals(genre)) {
            return Book.Genre.MYSTERY;
        } else if ("THRILLER".equals(genre)) {
            return Book.Genre.THRILLER;
        } else if ("HORROR".equals(genre)) {
            return Book.Genre.HORROR;
        } else if ("HISTORICAL".equals(genre)) {
            return Book.Genre.HISTORICAL;
        } else if ("ROMANCE".equals(genre)) {
            return Book.Genre.ROMANCE;
        } else if ("SCI_FICTION".equals(genre)) {
            return Book.Genre.SCI_FICTION;
        } else {
            return Book.Genre.UNKNOWN;
        }
    }

    public Book createRandomBook() {
        String bookName = randomName();
        return Book.newBuilder()
                .setId(UUID.nameUUIDFromBytes(bookName.getBytes()).toString())
                .setName(bookName)
                .setAuthor(randomAuthor())
                .setPrice(rand.nextInt(1, 300))
                .setPublication(randomPublication())
                .setPublishYear(rand.nextInt(1990, 2023))
                .addSample(randomSample())
                .addSample(randomSample())
                .addImage(getImage("src/main/resources/images_source/img1.png"))
                .addImage(getImage("src/main/resources/images_source/img2.png"))
                .addImage(getImage("src/main/resources/images_source/img3.png"))
                .addGenre(randomGenre())
                .addGenre(randomGenre())
                .addGenre(randomGenre())
                .setPopularity(rand.nextInt(100))
                .build();
    }
}

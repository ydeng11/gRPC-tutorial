package today.ihelio.sample;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author helio
 * @date 2022/9/3
 * @package today.ihelio.sample
 */
class GeneratorTest {

    @Test
    void createRandomBook() {
        Generator generator = new Generator();
        System.out.println(generator.createRandomBook());
    }
    @Test
    void findImages() {
        Path path = Paths.get("src/main/resources/images_source/img2.png");
        if (Files.exists(path)) {
            System.out.println("Yes");
        }
    }

}
package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.impl;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service.FileWriterService;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriterServiceImpl implements FileWriterService {
    @Override
    public void writeToFile(String data, String toFilePath) {
        try {
            Files.writeString(Path.of(toFilePath), data);
        } catch (IOException e) {
            throw new RuntimeException("Can't write data to file " + toFilePath, e);
        }
    }
}

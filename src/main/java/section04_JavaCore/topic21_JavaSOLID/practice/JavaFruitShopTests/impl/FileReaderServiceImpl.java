package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.impl;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.service.FileReaderService;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class FileReaderServiceImpl implements FileReaderService {
    @Override
    public List<String> readFile(String fromFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fromFilePath))) {
            return reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Can't read data from file " + fromFilePath, e);
        }
    }
}

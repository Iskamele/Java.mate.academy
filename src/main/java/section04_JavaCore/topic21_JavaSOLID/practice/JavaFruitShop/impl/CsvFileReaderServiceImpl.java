package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service.CsvFileReaderService;

public class CsvFileReaderServiceImpl implements CsvFileReaderService {

    @Override
    public List<String> readCsvFile(String fromFileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fromFileName))) {
            return reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Can't read data from file " + fromFileName, e);
        }
    }
}

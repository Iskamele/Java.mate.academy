package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service;

import java.util.List;

public interface CsvFileReaderService {
    List<String> readCsvFile(String fromFileName);
}

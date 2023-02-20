package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.service;

import java.util.List;

public interface FileReaderService {
    List<String> readCsvFile(String fromFileName);
}

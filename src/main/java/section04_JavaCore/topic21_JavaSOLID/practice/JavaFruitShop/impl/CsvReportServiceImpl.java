package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.impl;

import java.util.stream.Collectors;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.database.Storage;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service.CsvReportService;

public class CsvReportServiceImpl implements CsvReportService {
    private static final String TITLE = "fruit,quantity\n";
    private static final String DATA_SEPARATOR = ",";

    @Override
    public String getReport() {
        return TITLE + Storage.fruitStorage.entrySet()
                .stream()
                .map(s -> s.getKey() + DATA_SEPARATOR + s.getValue() + System.lineSeparator())
                .collect(Collectors.joining());
    }
}


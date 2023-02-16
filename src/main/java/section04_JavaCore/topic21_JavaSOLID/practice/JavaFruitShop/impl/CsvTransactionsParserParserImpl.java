package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.impl;

import java.util.List;
import java.util.stream.Collectors;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.model.FruitTransaction;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service.CsvTransactionsParser;

public class CsvTransactionsParserParserImpl implements CsvTransactionsParser {
    private final int OPERATION_POSITION = 0;
    private final int FRUIT_POSITION = 1;
    private final int QUANTITY_POSITION = 2;
    private final int TITLE_POSITION = 1;
    private static final String DATA_SEPARATOR = ",";

    @Override
    public List<FruitTransaction> parseTransactions(List<String> transactions) {
        return transactions.stream()
                .skip(TITLE_POSITION)
                .map(this::parseLine)
                .collect(Collectors.toList());
    }

    private FruitTransaction parseLine(String line) {
        String[] data = line.split(DATA_SEPARATOR);
        return new FruitTransaction(
                FruitTransaction.Operation.getByCharacter(data[OPERATION_POSITION]),
                data[FRUIT_POSITION],
                Integer.parseInt(data[QUANTITY_POSITION]));
    }
}
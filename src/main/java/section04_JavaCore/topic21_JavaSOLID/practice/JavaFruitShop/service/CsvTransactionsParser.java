package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service;

import java.util.List;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.model.FruitTransaction;

public interface CsvTransactionsParser {
    List<FruitTransaction> parseTransactions(List<String> transactions);
}

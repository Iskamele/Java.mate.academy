package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.service;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.model.FruitTransaction;
import java.util.List;

public interface FruitShopService {
    void processTransactions(List<FruitTransaction> fruitTransactionList);
}

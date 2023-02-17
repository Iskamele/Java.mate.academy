package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.model.FruitTransaction;
import java.util.List;

public interface FruitShopService {
    void transactionProcess(List<FruitTransaction> fruitTransactionList);
}

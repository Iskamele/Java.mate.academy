package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service;

import java.util.List;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.model.FruitTransaction;

public interface FruitShopService {
    void transactionProcess(List<FruitTransaction> fruitTransactionList);
}

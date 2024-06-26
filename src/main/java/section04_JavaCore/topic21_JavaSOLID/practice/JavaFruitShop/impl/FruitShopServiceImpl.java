package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.impl;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.model.FruitTransaction;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationStrategy.OperationStrategy;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service.FruitShopService;
import java.util.List;

public class FruitShopServiceImpl implements FruitShopService {
    private final OperationStrategy operationStrategy;

    public FruitShopServiceImpl(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    @Override
    public void processTransactions(List<FruitTransaction> transactionsList) {
        for (FruitTransaction fruitTransaction : transactionsList) {
            operationStrategy.handleOperation(fruitTransaction);
        }
    }
}

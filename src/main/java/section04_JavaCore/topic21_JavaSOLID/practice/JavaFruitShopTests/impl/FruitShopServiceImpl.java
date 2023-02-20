package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.impl;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.model.FruitTransaction;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.operationstrategy.OperationStrategy;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.service.FruitShopService;
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

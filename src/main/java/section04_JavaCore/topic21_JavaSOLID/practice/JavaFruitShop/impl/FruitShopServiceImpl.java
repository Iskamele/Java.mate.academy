package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.impl;

import java.util.List;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.model.FruitTransaction;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationStrategy.OperationStrategy;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service.FruitShopService;

public class FruitShopServiceImpl implements FruitShopService {
    private final OperationStrategy operationStrategy;

    public FruitShopServiceImpl(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    @Override
    public void transactionProcess(List<FruitTransaction> transactionsList) {
        for (FruitTransaction fruitTransaction : transactionsList) {
            operationStrategy.get(fruitTransaction.getOperation()).handleOperation(fruitTransaction);
        }
    }
}

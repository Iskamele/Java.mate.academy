package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationStrategy;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.model.FruitTransaction;

public interface OperationHandler {
    void handleOperation(FruitTransaction transaction);
}

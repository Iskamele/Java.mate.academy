package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.operation;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.model.FruitTransaction;

public interface OperationHandler {
    void handleOperation(FruitTransaction transaction);
}

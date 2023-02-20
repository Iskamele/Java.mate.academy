package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.operation;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.database.Storage;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.model.FruitTransaction;

public class ReturnOperation implements OperationHandler {
    @Override
    public void handleOperation(FruitTransaction transaction) {
        Storage.getFruitStorage().merge(
                transaction.getFruit(),
                transaction.getQuantity(),
                Integer::sum
        );
    }
}

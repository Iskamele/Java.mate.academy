package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationImpl;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.database.Storage;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.model.FruitTransaction;

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

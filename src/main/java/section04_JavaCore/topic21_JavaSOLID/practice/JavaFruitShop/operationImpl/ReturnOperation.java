package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationImpl;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.database.Storage;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.model.FruitTransaction;

public class ReturnOperation implements OperationHandler {

    @Override
    public void handleOperation(FruitTransaction transaction) {
        int oldQuantity = Storage.getFruitStorage().get(transaction.getFruit());
        Storage.getFruitStorage().put(transaction.getFruit(),
                oldQuantity + transaction.getQuantity());
    }
}

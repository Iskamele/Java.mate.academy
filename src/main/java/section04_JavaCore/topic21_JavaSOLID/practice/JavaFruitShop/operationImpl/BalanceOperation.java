package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationImpl;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.database.Storage;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.model.FruitTransaction;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationStrategy.OperationHandler;

public class BalanceOperation implements OperationHandler {

    @Override
    public void handleOperation(FruitTransaction transaction) {
        Storage.fruitStorage.put(transaction.getFruit(), transaction.getQuantity());
    }
}

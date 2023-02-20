package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.operation;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.database.Storage;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.model.FruitTransaction;

public class PurchaseOperation implements OperationHandler {
    @Override
    public void handleOperation(FruitTransaction transaction) {
        Storage.getFruitStorage().merge(
                transaction.getFruit(),
                transaction.getQuantity(),
                PurchaseOperation::purchaseOperation);
    }

    private static Integer purchaseOperation(Integer oldValue, Integer newValue) {
        int result = oldValue - newValue;
        if (result < 0) {
            throw new RuntimeException("Not enough fruit. The transaction could not be completed.");
        }
        return result;
    }
}

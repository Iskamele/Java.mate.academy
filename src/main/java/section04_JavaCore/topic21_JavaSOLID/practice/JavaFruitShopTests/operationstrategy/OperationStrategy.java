package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.operationstrategy;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.model.FruitTransaction;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.operation.OperationHandler;
import java.util.Map;

public class OperationStrategy {
    private final Map<FruitTransaction.Operation, OperationHandler> operationHandlerMap;

    public OperationStrategy(Map<FruitTransaction.Operation,
            OperationHandler> operationHandlerMap) {
        this.operationHandlerMap = operationHandlerMap;
    }

    public void handleOperation(FruitTransaction fruitTransaction) {
        get(fruitTransaction).handleOperation(fruitTransaction);
    }

    private OperationHandler get(FruitTransaction fruitTransaction) {
        return operationHandlerMap.get(fruitTransaction.getOperation());
    }
}

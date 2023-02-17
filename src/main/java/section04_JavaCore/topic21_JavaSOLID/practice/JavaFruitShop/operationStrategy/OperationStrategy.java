package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationStrategy;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.model.FruitTransaction;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationImpl.OperationHandler;
import java.util.Map;

public class OperationStrategy {
    private final Map<FruitTransaction.Operation, OperationHandler> operationHandlerMap;

    public OperationStrategy(Map<FruitTransaction.Operation,
            OperationHandler> operationHandlerMap) {
        this.operationHandlerMap = operationHandlerMap;
    }

    public OperationHandler get(FruitTransaction fruitTransaction) {
        return operationHandlerMap.get(fruitTransaction.getOperation());
    }

    public void handleOperation(FruitTransaction fruitTransaction) {
        get(fruitTransaction).handleOperation(fruitTransaction);
    }
}

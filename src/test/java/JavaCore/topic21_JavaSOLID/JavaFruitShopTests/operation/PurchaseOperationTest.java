package JavaCore.topic21_JavaSOLID.JavaFruitShopTests.operation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.database.Storage;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.model.FruitTransaction;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.operation.OperationHandler;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.operation.PurchaseOperation;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.MockedStatic;

public class PurchaseOperationTest {
    private static OperationHandler operationHandler;
    private static final String FRUIT = "banana";
    private static final Integer FIRST_QUANTITY = 100;
    private static final Integer SECOND_QUANTITY = 30;
    private static Map<String, Integer> fruitStorage;
    private static MockedStatic<Storage> mockStorage;

    @BeforeClass
    public static void beforeClass() {
        mockStorage = mockStatic(Storage.class);
        fruitStorage = new HashMap<>();
    }

    @Before
    public void setUp() {
        operationHandler = new PurchaseOperation();
    }

    @After
    public void storageClear() {
        fruitStorage.clear();
    }

    @AfterClass
    public static void closeMock() {
        mockStorage.close();
    }

    @Test
    public void handleOperation_getPurchase_Ok() {
        //arrange
        fruitStorage.put(FRUIT, FIRST_QUANTITY);
        FruitTransaction transaction = new FruitTransaction(FruitTransaction.Operation.BALANCE,
                FRUIT, SECOND_QUANTITY);
        Integer expected = FIRST_QUANTITY - SECOND_QUANTITY;
        when(Storage.getFruitStorage()).thenReturn(fruitStorage);

        //act
        operationHandler.handleOperation(transaction);
        Integer actual = fruitStorage.get(FRUIT);

        //assert
        assertEquals("PurchaseOperation should update a quantity in DB.",
                expected, actual);
    }

    @Test
    public void handleOperation_addNewFruitInStorage_Ok() {
        //arrange
        FruitTransaction transaction = new FruitTransaction(FruitTransaction.Operation.BALANCE,
                FRUIT, SECOND_QUANTITY);
        Integer expected = SECOND_QUANTITY;
        when(Storage.getFruitStorage()).thenReturn(fruitStorage);

        //act
        operationHandler.handleOperation(transaction);
        Integer actual = fruitStorage.get(FRUIT);

        //assert
        assertEquals("PurchaseOperation should add new transaction in DB.",
                expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void handleOperation_purchaseMoreThanKeptInStorage_NotOk() {
        //arrange
        fruitStorage.put(FRUIT, SECOND_QUANTITY);
        FruitTransaction transaction = new FruitTransaction(FruitTransaction.Operation.BALANCE,
                FRUIT, FIRST_QUANTITY);

        //act
        operationHandler.handleOperation(transaction);

        //assert
        fail("Not enough fruit. The transaction could not be completed.");
    }
}

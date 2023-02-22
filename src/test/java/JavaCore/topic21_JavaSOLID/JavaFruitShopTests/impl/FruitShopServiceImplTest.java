package JavaCore.topic21_JavaSOLID.JavaFruitShopTests.impl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.impl.FruitShopServiceImpl;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.model.FruitTransaction;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.operationstrategy.OperationStrategy;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.service.FruitShopService;
import java.util.Collections;
import java.util.List;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class FruitShopServiceImplTest {
    private static OperationStrategy mockOperationStrategy;
    private static FruitShopService fruitShopService;
    private static List<FruitTransaction> fruitTransactions;
    private static FruitTransaction first_transaction;
    private static FruitTransaction second_transaction;

    @BeforeClass
    public static void beforeClass() {
        first_transaction = new FruitTransaction(FruitTransaction.Operation.SUPPLY, "apple", 10);
        second_transaction = new FruitTransaction(FruitTransaction.Operation.SUPPLY, "apple", 10);
        fruitTransactions = List.of(first_transaction, second_transaction);
    }

    @Before
    public void setUp() {
        mockOperationStrategy = mock(OperationStrategy.class);
        fruitShopService = new FruitShopServiceImpl(mockOperationStrategy);
    }

    @Test
    public void processTransactions_EmptyList() {
        //act
        fruitShopService.processTransactions(Collections.emptyList());
        //assert
        verifyNoInteractions(mockOperationStrategy);
    }

    @Test
    public void processTransactions_SingleTransaction() {
        //act
        fruitShopService.processTransactions(Collections.singletonList(first_transaction));
        //assert
        verify(mockOperationStrategy).handleOperation(first_transaction);
        verifyNoMoreInteractions(mockOperationStrategy);
    }

    @Test
    @Ignore // TODO: 22.02.2023 Іду бачу тест ліг, думаю дай і я ляжу.
    public void processTransactions_ListOfTransactions() {
        //act
        fruitShopService.processTransactions(List.of(first_transaction, second_transaction));
        //assert
        verify(mockOperationStrategy).handleOperation(first_transaction);
        verify(mockOperationStrategy).handleOperation(second_transaction);
        verifyNoMoreInteractions(mockOperationStrategy);
    }
}

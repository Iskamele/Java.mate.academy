package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.impl.CsvTransactionsParserImpl;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.impl.FileReaderServiceImpl;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.impl.FileWriterServiceImpl;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.impl.FruitShopServiceImpl;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.impl.ReportServiceImpl;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.model.FruitTransaction;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.operation.BalanceOperation;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.operation.OperationHandler;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.operation.PurchaseOperation;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.operation.ReturnOperation;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.operation.SupplyOperation;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.operationstrategy.OperationStrategy;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.service.CsvTransactionsParser;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.service.FileReaderService;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.service.FileWriterService;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.service.FruitShopService;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShopTests.service.ReportService;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final LocalDateTime LOCAL_DATE_TIME = LocalDateTime.now();
    private static final DateTimeFormatter DATE_TIME_FORMATTER =
            DateTimeFormatter.ofPattern("dd.MM.yyyy HH-mm");
    private static final String TO_FILE_PATH = "src/main/resources/report from "
            + LOCAL_DATE_TIME.format(DATE_TIME_FORMATTER) + ".csv";
    private static final String FROM_FILE_PATH = "src/main/resources/transactions.csv";

    public static void main(String[] args) {
        Map<FruitTransaction.Operation, OperationHandler> operationHandlerMap = new HashMap<>();
        operationHandlerMap.put(FruitTransaction.Operation.BALANCE, new BalanceOperation());
        operationHandlerMap.put(FruitTransaction.Operation.SUPPLY, new SupplyOperation());
        operationHandlerMap.put(FruitTransaction.Operation.PURCHASE, new PurchaseOperation());
        operationHandlerMap.put(FruitTransaction.Operation.RETURN, new ReturnOperation());

        FileReaderService fileReaderService = new FileReaderServiceImpl();
        List<String> csvLines = fileReaderService.readFile(FROM_FILE_PATH);

        CsvTransactionsParser csvTransactionsParser = new CsvTransactionsParserImpl();
        List<FruitTransaction> fruitTransactionList =
                csvTransactionsParser.parseTransactions(csvLines);

        OperationStrategy operationStrategy = new OperationStrategy(operationHandlerMap);
        FruitShopService fruitShopService = new FruitShopServiceImpl(operationStrategy);
        fruitShopService.processTransactions(fruitTransactionList);

        ReportService reportService = new ReportServiceImpl();
        String report = reportService.getReport();

        FileWriterService fileWriterService = new FileWriterServiceImpl();
        fileWriterService.writeToFile(report, TO_FILE_PATH);
    }
}

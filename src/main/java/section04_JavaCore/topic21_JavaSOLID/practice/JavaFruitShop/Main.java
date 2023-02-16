package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.impl.CsvFileReaderServiceImpl;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.impl.CsvFileWriterServiceImpl;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.impl.CsvReportServiceImpl;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.impl.CsvTransactionsParserParserImpl;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.impl.FruitShopServiceImpl;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.model.FruitTransaction;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationImpl.BalanceOperation;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationImpl.PurchaseOperation;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationImpl.ReturnOperation;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationImpl.SupplyOperation;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationStrategy.OperationHandler;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationStrategy.OperationStrategy;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service.CsvFileReaderService;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service.CsvFileWriterService;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service.CsvReportService;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service.CsvTransactionsParser;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service.FruitShopService;

public class Main {
    private static final LocalDateTime LOCAL_DATE_TIME = LocalDateTime.now();
    private static final DateTimeFormatter DATE_TIME_FORMATTER =
            DateTimeFormatter.ofPattern("dd.MM.yyyy HH-mm");
    private static final String TO_FILE_PATH = "src/main/resources/report from " + LOCAL_DATE_TIME.format(DATE_TIME_FORMATTER) + ".csv";
    private static final String FROM_FILE_PATH = "src/main/resources/transactions.csv";

    public static void main(String[] args) {
        Map<FruitTransaction.Operation, OperationHandler> operationHandlerMap = new HashMap<>();
        operationHandlerMap.put(FruitTransaction.Operation.BALANCE, new BalanceOperation());
        operationHandlerMap.put(FruitTransaction.Operation.SUPPLY, new SupplyOperation());
        operationHandlerMap.put(FruitTransaction.Operation.PURCHASE, new PurchaseOperation());
        operationHandlerMap.put(FruitTransaction.Operation.RETURN, new ReturnOperation());

        CsvFileReaderService csvFileReaderService = new CsvFileReaderServiceImpl();
        List<String> processedData = csvFileReaderService.readCsvFile(FROM_FILE_PATH);

        CsvTransactionsParser csvTransactionsParser = new CsvTransactionsParserParserImpl();
        List<FruitTransaction> fruitTransactionList =
                csvTransactionsParser.parseTransactions(processedData);

        OperationStrategy operationStrategy = new OperationStrategy(operationHandlerMap);
        FruitShopService fruitShopService = new FruitShopServiceImpl(operationStrategy);
        fruitShopService.transactionProcess(fruitTransactionList);

        CsvReportService csvReportService = new CsvReportServiceImpl();
        String report = csvReportService.getReport();

        CsvFileWriterService csvFileWriterService = new CsvFileWriterServiceImpl();
        csvFileWriterService.writeToFile(report, TO_FILE_PATH);
    }
}

package section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop;

import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.impl.CsvFileValidationImpl;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.impl.CsvTransactionsParserImpl;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.impl.FileReaderServiceImpl;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.impl.FileWriterServiceImpl;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.impl.FruitShopServiceImpl;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.impl.ReportServiceImpl;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.model.FruitTransaction;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationImpl.BalanceOperation;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationImpl.OperationHandler;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationImpl.PurchaseOperation;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationImpl.ReturnOperation;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationImpl.SupplyOperation;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.operationStrategy.OperationStrategy;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service.CsvTransactionsParser;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service.FileReaderService;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service.FileValidation;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service.FileWriterService;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service.FruitShopService;
import section04_JavaCore.topic21_JavaSOLID.practice.JavaFruitShop.service.ReportService;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        FileValidation fileValidation = new CsvFileValidationImpl();
        fileValidation.validateFile(FROM_FILE_PATH);

        FileReaderService fileReaderService = new FileReaderServiceImpl();
        List<String> csvLines = fileReaderService.readCsvFile(FROM_FILE_PATH);

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

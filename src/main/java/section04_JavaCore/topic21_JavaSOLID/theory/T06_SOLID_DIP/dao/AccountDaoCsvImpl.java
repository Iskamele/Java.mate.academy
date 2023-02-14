package section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.dao;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.model.Account;

public class AccountDaoCsvImpl implements AccountDao {
    private static final String FILE_NAME = "database.csv";

    @Override
    public void add(Account account) {

    }

    @Override
    public Account get(String accountNumber) {
        List<String> accounts = new ArrayList<>();
        try {
            accounts = Files.readAllLines(Path.of(FILE_NAME));
        } catch (IOException e) {
            throw new RuntimeException("Can't get data from file " + FILE_NAME);
        }
        return accounts.stream()
                .filter(line -> line.startsWith(accountNumber))
                .map(this::getFromCsvRow)
                .findFirst().get();
    }

    @Override
    public void update(Account account) {

    }

    private Account getFromCsvRow(String line) {
        String[] fields = line.split(","); // will return array of fields values
        Account account = new Account();
        account.setMaster(fields[0]);
        account.setNumber(fields[1]);
        account.setAmount(new BigDecimal(fields[2]));
        account.setType(Account.Type.valueOf(fields[3]));
        return account;

    }
}

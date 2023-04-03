package section06_JavaJDBC.topic03_DAOVsService.theory.T01_NTierArchitecture;

import java.math.BigDecimal;
import section06_JavaJDBC.topic03_DAOVsService.theory.T01_NTierArchitecture.dao.jdbc.BankAccountDaoJdbcImpl;
import section06_JavaJDBC.topic03_DAOVsService.theory.T01_NTierArchitecture.model.BankAccount;
import section06_JavaJDBC.topic03_DAOVsService.theory.T01_NTierArchitecture.service.BankAccountService;
import section06_JavaJDBC.topic03_DAOVsService.theory.T01_NTierArchitecture.service.impl.BankAccountServiceImpl;

public class Application {

    public static void main(String[] args) {
        BankAccountService bankAccountService = new BankAccountServiceImpl(new BankAccountDaoJdbcImpl());
        bankAccountService.transfer("12345", "56789", BigDecimal.valueOf(100));

        BankAccount bobsAccount = new BankAccount();
        bobsAccount.setAmount(BigDecimal.ZERO);
        bobsAccount.setAccountNumber("3456");
        bobsAccount.setOwnerName("Bob");
        bankAccountService.create(bobsAccount);
    }
}

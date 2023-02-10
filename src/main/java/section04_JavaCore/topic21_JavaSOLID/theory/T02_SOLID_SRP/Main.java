package section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP;

import java.math.BigDecimal;
import section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.dao.AccountDao;
import section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.dao.AccountDaoImpl;
import section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.model.Account;
import section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.service.AccountService;
import section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.service.AccountServiceImpl;
import section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.service.BankService;
import section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.service.BankServiceImpl;

public class Main {

    public static void main(String[] args) {
        // SOLID: SRP - Single Responsibility Principle

        AccountDao accountDao = new AccountDaoImpl();
        AccountService accountService = new AccountServiceImpl(accountDao);
        BankService bankService = new BankServiceImpl(accountDao);

        accountService.createNewAccount("Bob Alison", "5566 6364 8442 9998");
        accountService.createNewAccount("John Rust", "5566 6364 8986 4289");
        Account bobAccount = accountDao.get("5566 6364 8442 9998");
        Account johnAccount = accountDao.get("5566 6364 8986 4289");

        bobAccount.setAmount(BigDecimal.valueOf(58000));
        johnAccount.setAmount(BigDecimal.valueOf(6000));

        // Transfer money between two bank accounts
        System.out.println(accountDao.get("5566 6364 8442 9998"));
        System.out.println(accountDao.get("5566 6364 8986 4289"));

        bankService.transfer("5566 6364 8442 9998", "5566 6364 8986 4289", BigDecimal.valueOf(10500));

        System.out.println(accountDao.get("5566 6364 8442 9998"));
        System.out.println(accountDao.get("5566 6364 8986 4289"));
    }
}

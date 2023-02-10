package section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.dao.AccountDao;
import section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.dao.AccountDaoImpl;
import section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.model.Account;
import section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.service.AccountService;
import section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.service.AccountServiceImpl;
import section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.service.BankService;
import section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.service.BankServiceImpl;
import section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.service.CommissionStrategy;
import section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.service.CommissionStrategyImpl;
import section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.service.commission.CommissionHandler;
import section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.service.commission.GoldCommissionHandler;

public class Main {

    public static void main(String[] args) {
        // SOLID: OCP - Open Closed Principle

        Map<Account.Type, CommissionHandler> commissionHandlerMap = new HashMap<>();
        commissionHandlerMap.put(Account.Type.GOLD, new GoldCommissionHandler());
        commissionHandlerMap.put(Account.Type.PLATINUM, new GoldCommissionHandler());
        commissionHandlerMap.put(Account.Type.ULTRA, new GoldCommissionHandler());
        commissionHandlerMap.put(Account.Type.REGULAR, new GoldCommissionHandler());
        commissionHandlerMap.put(Account.Type.USUAL, new GoldCommissionHandler());

        AccountDao accountDao = new AccountDaoImpl();
        AccountService accountService = new AccountServiceImpl(accountDao);
        CommissionStrategy commissionStrategy = new CommissionStrategyImpl(commissionHandlerMap);
        BankService bankService = new BankServiceImpl(accountDao, commissionStrategy);

        accountService.createNewAccount("Bob Alison", "5566 6364 8442 9998");
        accountService.createNewAccount("John Rust", "5566 6364 8986 4289");
        Account bobAccount = accountDao.get("5566 6364 8442 9998");
        bobAccount.setType(Account.Type.REGULAR);
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

package section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.service;

import java.math.BigDecimal;
import section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.dao.AccountDao;
import section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.model.Account;

public class BankServiceImpl implements BankService {
    private AccountDao accountDao;
    private CommissionStrategy commissionStrategy;

    public BankServiceImpl(AccountDao accountDao, CommissionStrategy commissionStrategy) {
        this.accountDao = accountDao;
        this.commissionStrategy = commissionStrategy;
    }

    @Override
    public void transfer(String fromAccountNumber,
                         String toAccountNumber, BigDecimal amount) {
        Account fromAccount = accountDao.get(fromAccountNumber);
        Account toAccount = accountDao.get(toAccountNumber);

        // TODO: calculate commission based on account type
        // if Account.Type.REGULAR --> commission is 1% from amount
        // if Account.Type.GOLD --> commission is 3 UAH
        // if Account.Type.PLATINUM --> commission is 0 UAH
        // if Account.Type.USUAL --> commission is 10 UAH

        BigDecimal commission = commissionStrategy.get(fromAccount.getType()).getCommission(amount);

        BigDecimal newValueFrom = fromAccount.getAmount().subtract(amount).subtract(commission);
        fromAccount.setAmount(newValueFrom);

        BigDecimal newValueTo = toAccount.getAmount().add(amount);
        toAccount.setAmount(newValueTo);

        accountDao.update(toAccount);
        accountDao.update(fromAccount);
    }
}

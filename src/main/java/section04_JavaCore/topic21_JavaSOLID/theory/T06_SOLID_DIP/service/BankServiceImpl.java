package section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.service;

import java.math.BigDecimal;
import section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.dao.AccountDao;
import section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.model.Account;

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

        BigDecimal commission = commissionStrategy.get(fromAccount.getType()).getCommission(amount);

        BigDecimal newValueFrom = fromAccount.getAmount().subtract(amount).subtract(commission);
        fromAccount.setAmount(newValueFrom);

        BigDecimal newValueTo = toAccount.getAmount().add(amount);
        toAccount.setAmount(newValueTo);

        accountDao.update(toAccount);
        accountDao.update(fromAccount);
    }
}

package section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.service;

import java.math.BigDecimal;
import section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.dao.AccountDao;
import section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.model.Account;

public class BankServiceImpl implements BankService {
    private AccountDao accountDao;

    public BankServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String fromAccountNumber,
                         String toAccountNumber, BigDecimal amount) {
        // TODO: implement

        // 1. Get accounts from storage
        Account fromAccount = accountDao.get(fromAccountNumber);
        Account toAccount = accountDao.get(toAccountNumber);

        BigDecimal newValueFrom = fromAccount.getAmount().subtract(amount);
        fromAccount.setAmount(newValueFrom);

        BigDecimal newValueTo = toAccount.getAmount().add(amount);
        toAccount.setAmount(newValueTo);

        accountDao.update(toAccount);
        accountDao.update(fromAccount);
        // 2. Transfer money between accounts
    }
}

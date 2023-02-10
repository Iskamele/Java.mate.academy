package section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.service;

import section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.dao.AccountDao;
import section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.model.Account;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void createNewAccount(String accountMaster, String accountNumber) {
        Account account = new Account(accountMaster, accountNumber);
        account.setNumber(accountNumber);
        accountDao.add(account);
    }
}

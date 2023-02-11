package section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.service;

import section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.dao.AccountDao;
import section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.model.Account;

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

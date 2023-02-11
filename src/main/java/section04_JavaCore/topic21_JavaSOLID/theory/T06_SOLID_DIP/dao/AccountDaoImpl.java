package section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.dao;

import section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.db.Storage;
import section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.model.Account;

public class AccountDaoImpl implements AccountDao {
    @Override
    public void add(Account account) {
        Storage.accounts.add(account);
    }

    @Override
    public Account get(String accountNumber) {
        return Storage.accounts.stream()
                .filter(a -> a.getNumber().equals(accountNumber))
                .findFirst().get();
    }

    @Override
    public void update(Account account) {
        Account accountFromDb = get(account.getNumber());
        Storage.accounts.remove(accountFromDb);
        add(account);
    }
}

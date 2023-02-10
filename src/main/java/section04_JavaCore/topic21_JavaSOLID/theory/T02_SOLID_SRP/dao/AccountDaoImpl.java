package section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.dao;

import section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.db.Storage;
import section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.model.Account;

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
        // 1. find
        // 2. remove
        // 3. add
        Account accountFromDb = get(account.getNumber());
        Storage.accounts.remove(accountFromDb);
        add(account);
    }
}

package section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.dao;

import section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.model.Account;

public interface AccountDao {
    void add(Account account);

    Account get(String accountNumber);

    void update(Account account);
}

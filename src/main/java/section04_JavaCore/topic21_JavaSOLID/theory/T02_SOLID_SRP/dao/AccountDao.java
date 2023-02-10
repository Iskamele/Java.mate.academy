package section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.dao;

import section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.model.Account;

public interface AccountDao {
    void add(Account account);
    Account get(String accountNumber);
    void update(Account account);
}

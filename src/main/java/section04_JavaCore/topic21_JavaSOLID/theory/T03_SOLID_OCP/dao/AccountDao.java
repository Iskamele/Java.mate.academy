package section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.dao;

import section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.model.Account;

public interface AccountDao {
    void add(Account account);
    Account get(String accountNumber);
    void update(Account account);
}

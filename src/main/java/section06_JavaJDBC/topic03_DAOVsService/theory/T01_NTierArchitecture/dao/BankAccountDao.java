package section06_JavaJDBC.topic03_DAOVsService.theory.T01_NTierArchitecture.dao;

import java.util.List;
import java.util.Optional;
import section06_JavaJDBC.topic03_DAOVsService.theory.T01_NTierArchitecture.model.BankAccount;

public interface BankAccountDao {
    BankAccount create(BankAccount value);

    Optional<BankAccount> get(Long id);

    List<BankAccount> getAll();

    BankAccount update(BankAccount value);

    boolean delete(Long id);

    Optional<BankAccount> findByAccountNumber(String accountNumber);
}

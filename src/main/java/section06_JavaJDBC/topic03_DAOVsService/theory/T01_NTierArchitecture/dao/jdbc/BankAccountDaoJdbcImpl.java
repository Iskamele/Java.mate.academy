package section06_JavaJDBC.topic03_DAOVsService.theory.T01_NTierArchitecture.dao.jdbc;

import java.util.List;
import java.util.Optional;
import section06_JavaJDBC.topic03_DAOVsService.theory.T01_NTierArchitecture.dao.BankAccountDao;
import section06_JavaJDBC.topic03_DAOVsService.theory.T01_NTierArchitecture.model.BankAccount;

public class BankAccountDaoJdbcImpl implements BankAccountDao {
    @Override
    public BankAccount create(BankAccount value) {
        return null;
    }

    @Override
    public Optional<BankAccount> get(Long id) {
        return Optional.empty();
    }

    @Override
    public List<BankAccount> getAll() {
        return null;
    }

    @Override
    public BankAccount update(BankAccount value) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public Optional<BankAccount> findByAccountNumber(String accountNumber) {
        return Optional.empty();
    }
}

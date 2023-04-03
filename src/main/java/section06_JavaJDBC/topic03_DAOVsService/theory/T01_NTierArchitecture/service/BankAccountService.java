package section06_JavaJDBC.topic03_DAOVsService.theory.T01_NTierArchitecture.service;

import java.math.BigDecimal;
import section06_JavaJDBC.topic03_DAOVsService.theory.T01_NTierArchitecture.model.BankAccount;

public interface BankAccountService {
    void transfer(String fromAccount, String toAccount, BigDecimal amount);

    BankAccount create(BankAccount bankAccount);
}

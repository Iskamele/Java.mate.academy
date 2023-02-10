package section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.service;

import java.math.BigDecimal;

public interface BankService {
    void transfer(String fromAccount, String toAccount, BigDecimal amount);
}

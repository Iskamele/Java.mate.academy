package section04_JavaCore.topic21_JavaSOLID.theory.T06_SOLID_DIP.service;

import java.math.BigDecimal;

public interface BankService {
    void transfer(String fromAccount, String toAccount, BigDecimal amount);
}

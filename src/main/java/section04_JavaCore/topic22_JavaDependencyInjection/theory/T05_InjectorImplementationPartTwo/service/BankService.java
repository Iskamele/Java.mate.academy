package section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.service;

import java.math.BigDecimal;

public interface BankService {
    void transfer(String accountFrom, String accountTo, BigDecimal amount);
}

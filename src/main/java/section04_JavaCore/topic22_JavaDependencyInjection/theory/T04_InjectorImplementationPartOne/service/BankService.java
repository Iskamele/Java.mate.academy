package section04_JavaCore.topic22_JavaDependencyInjection.theory.T04_InjectorImplementationPartOne.service;

import java.math.BigDecimal;

public interface BankService {
    void transfer(String accountFrom, String accountTo, BigDecimal amount);
}

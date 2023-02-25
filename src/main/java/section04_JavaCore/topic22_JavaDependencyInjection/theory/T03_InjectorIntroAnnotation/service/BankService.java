package section04_JavaCore.topic22_JavaDependencyInjection.theory.T03_InjectorIntroAnnotation.service;

import java.math.BigDecimal;

public interface BankService {
    void transfer(String accountFrom, String accountTo, BigDecimal amount);
}

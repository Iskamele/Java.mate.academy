package section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.service;

import java.math.BigDecimal;
import section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.model.User;

public interface BankService {
    void pay(int serviceId, BigDecimal amount, User user);
}

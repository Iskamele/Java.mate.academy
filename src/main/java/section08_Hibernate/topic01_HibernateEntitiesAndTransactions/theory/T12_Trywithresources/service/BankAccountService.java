package section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T12_Trywithresources.service;

import java.math.BigDecimal;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T12_Trywithresources.model.BankAccount;

public interface BankAccountService {
    void transfer(BankAccount from, BankAccount to, BigDecimal amount);
}

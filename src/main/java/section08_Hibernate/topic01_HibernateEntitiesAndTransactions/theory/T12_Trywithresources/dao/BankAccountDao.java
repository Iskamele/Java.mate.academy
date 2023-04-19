package section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T12_Trywithresources.dao;

import java.math.BigDecimal;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T12_Trywithresources.model.BankAccount;

public interface BankAccountDao {
    BankAccount save(BankAccount bankAccount);

    BankAccount get(Long id);

    void transfer(BankAccount from, BankAccount to, BigDecimal amount);
}

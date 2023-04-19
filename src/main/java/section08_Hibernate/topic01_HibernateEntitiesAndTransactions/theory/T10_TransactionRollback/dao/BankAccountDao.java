package section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T10_TransactionRollback.dao;

import java.math.BigDecimal;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T10_TransactionRollback.model.BankAccount;

public interface BankAccountDao {
    BankAccount save(BankAccount bankAccount);

    BankAccount get(Long id);

    void transfer(BankAccount from, BankAccount to, BigDecimal amount);
}

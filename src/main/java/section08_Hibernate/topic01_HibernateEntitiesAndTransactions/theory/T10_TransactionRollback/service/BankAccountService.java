package section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T10_TransactionRollback.service;

import java.math.BigDecimal;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T10_TransactionRollback.model.BankAccount;

public interface BankAccountService {
    void transfer(BankAccount from, BankAccount to, BigDecimal amount);
}

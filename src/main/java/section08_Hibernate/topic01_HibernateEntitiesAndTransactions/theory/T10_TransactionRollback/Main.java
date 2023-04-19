package section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T10_TransactionRollback;

import java.math.BigDecimal;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T10_TransactionRollback.model.BankAccount;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T10_TransactionRollback.dao.BankAccountDao;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T10_TransactionRollback.dao.BankAccountDaoImpl;

public class Main {

    public static void main(String[] args) {
        BankAccountDao bankAccountDao = new BankAccountDaoImpl();

        BankAccount senderAccount = new BankAccount("Bob", BigDecimal.valueOf(700));
        BankAccount receiverAccount = new BankAccount("Alice", BigDecimal.valueOf(150));

        bankAccountDao.save(senderAccount);
        bankAccountDao.save(receiverAccount);
        bankAccountDao.transfer(senderAccount, receiverAccount, BigDecimal.valueOf(200));
    }
}

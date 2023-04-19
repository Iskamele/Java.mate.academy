package section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T10_TransactionRollback.dao;

import java.math.BigDecimal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T10_TransactionRollback.model.BankAccount;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T10_TransactionRollback.util.HibernateUtil;

public class BankAccountDaoImpl implements BankAccountDao {
    @Override
    public BankAccount save(BankAccount bankAccount) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(bankAccount);
        transaction.commit();
        session.close();
        return bankAccount;
    }

    @Override
    public BankAccount get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return session.get(BankAccount.class, id);
    }

    @Override
    public void transfer(BankAccount sender, BankAccount receiver, BigDecimal amount) {
        if (sender.getAmount().compareTo(amount) < 0) {
            throw new RuntimeException("Not enough money");
        }

        // do some logic
        sender.setAmount(sender.getAmount().subtract(amount));
        receiver.setAmount(receiver.getAmount().add(amount));

        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(sender);
            if (true) {
                throw new RuntimeException("oops, error!");
            }
            session.update(receiver);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}

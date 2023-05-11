package section08_Hibernate.topic06_TransactionIsolationLevels.theory.T01_PasswordHashing.dao;

import section08_Hibernate.topic06_TransactionIsolationLevels.theory.T02_HowToUseHashing.util.HibernateUtil;
import section08_Hibernate.topic06_TransactionIsolationLevels.theory.T01_PasswordHashing.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserDaoImpl implements UserDao {
    @Override
    public User save(User user) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
            return user;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't insert user " + user, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public User get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            return session.get(User.class, id);
        }
    }
}

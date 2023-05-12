package section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.dao.impl;

import java.util.Optional;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.dao.UserDao;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.exception.DataProcessingException;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.lib.Dao;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.model.User;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class UserDaoImpl implements UserDao {
    @Override
    public User add(User user) {
        Session session = null;
        Transaction transaction = null;
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
            throw new DataProcessingException("Can't add user: " + user, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Optional<User> findByEmail(String email) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM User u WHERE u.email = :email", User.class)
                    .setParameter("email", email)
                    .uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Can't find user by email: " + email, e);
        }
    }
}

package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dao.impl;

import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dao.UserDao;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.exception.DataProcessingException;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.User;

@Repository
public class UserDaoImpl implements UserDao {
    private final SessionFactory factory;

    public UserDaoImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public User add(User user) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
            return user;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't insert user " + user, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Optional<User> get(Long id) {
        try (Session session = factory.openSession()) {
            Query<User> findByEmail = session.createQuery(
                    "FROM User WHERE id = :id", User.class);
            findByEmail.setParameter("id", id);
            return findByEmail.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get user, id: " + id, e);
        }
    }

    @Override
    public Optional<User> findByEmail(String email) {
        try (Session session = factory.openSession()) {
            Query<User> findByEmail = session.createQuery(
                    "FROM User WHERE email = :email", User.class);
            findByEmail.setParameter("email", email);
            return findByEmail.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get user, email: " + email, e);
        }
    }
}

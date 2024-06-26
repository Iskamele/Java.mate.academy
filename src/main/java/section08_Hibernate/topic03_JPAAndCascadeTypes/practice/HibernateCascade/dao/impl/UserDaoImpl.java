package section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.dao.impl;

import section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.dao.UserDao;
import section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.model.User;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserDaoImpl extends AbstractDao implements UserDao {
    public UserDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public User create(User entity) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't create user for: " + entity.getUsername(), e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return entity;
    }

    @Override
    public User get(Long id) {
        try (Session session = factory.openSession()) {
            return session.get(User.class, id);
        } catch (Exception e) {
            throw new RuntimeException("Can't get user by ID: " + id, e);
        }
    }

    @Override
    public List<User> getAll() {
//        try (Session session = factory.openSession()) {
//            Query<User> allUsers = session.createQuery(
//                    "FROM User ", User.class);
//            return allUsers.getResultList();
//        } catch (Exception e) {
//            throw new RuntimeException("Can't get all users, ", e);
//        }
        return null;
    }

    @Override
    public void remove(User entity) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.remove(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't remove user for: " + entity.getUsername(), e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}

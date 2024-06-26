package section09_Spring.topic01_SpringIntro.practice.SpringIntro.dao.impl;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import section09_Spring.topic01_SpringIntro.practice.SpringIntro.dao.UserDao;
import section09_Spring.topic01_SpringIntro.practice.SpringIntro.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    private final SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public User add(User user) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't add user to DB", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return user;
    }

    @Override
    public List<User> getAll() {
        try (Session session = sessionFactory.openSession()) {
            CriteriaQuery<User> allFromUserQuery =
                    session.getCriteriaBuilder().createQuery(User.class);
            allFromUserQuery.from(User.class);
            return session.createQuery(allFromUserQuery).getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Can't get all users");
        }
    }
}

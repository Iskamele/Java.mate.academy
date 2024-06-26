package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao.impl;

import java.util.Optional;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao.AbstractDao;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao.UserDao;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.exception.DataProcessingException;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends AbstractDao<User> implements UserDao {
    public UserDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        try (Session session = sessionFactory.openSession()) {
            Query<User> query = session.createQuery("FROM User u "
                    + "WHERE u.email = :email", User.class);
            query.setParameter("email", email);
            return query.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Can't find user by email: " + email, e);
        }
    }

    @Override
    public Optional<User> get(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return Optional.ofNullable(session.get(User.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("Can't find user by id: " + id, e);
        }
    }
}

package section09_Spring.topic04_REST.practice.SpringRest.dao.impl;

import java.util.Optional;
import section09_Spring.topic04_REST.practice.SpringRest.dao.AbstractDao;
import section09_Spring.topic04_REST.practice.SpringRest.dao.UserDao;
import section09_Spring.topic04_REST.practice.SpringRest.exception.DataProcessingException;
import section09_Spring.topic04_REST.practice.SpringRest.model.User;
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
}

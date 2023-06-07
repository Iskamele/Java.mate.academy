package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.impl;

import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.AbstractDao;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.UserDao;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.exception.DataProcessingException;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.User;

@Repository
public class UserDaoImpl extends AbstractDao<User> implements UserDao {
    public UserDaoImpl(SessionFactory factory) {
        super(factory, User.class);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        try (Session session = factory.openSession()) {
            Query<User> findByEmail = session.createQuery(
                    "FROM User WHERE email = :email", User.class);
            findByEmail.setParameter("email", email);
            return findByEmail.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("User with email " + email + " not found", e);
        }
    }
}

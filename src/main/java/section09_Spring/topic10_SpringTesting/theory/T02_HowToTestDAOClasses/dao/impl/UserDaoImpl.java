package section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.dao.impl;

import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.dao.UserDao;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.model.User;

@Repository
public class UserDaoImpl extends AbstractDao<User, Long> implements UserDao {
    public UserDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory, User.class);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery(
                            "FROM User u JOIN FETCH u.roles WHERE u.email = :email", User.class)
                    .setParameter("email", email)
                    .uniqueResultOptional();
        }
    }
}

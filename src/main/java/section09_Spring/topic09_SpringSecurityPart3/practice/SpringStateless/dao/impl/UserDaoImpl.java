package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.dao.impl;

import java.util.List;
import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.dao.UserDao;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.exception.DataProcessingException;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.User;

@Repository
public class UserDaoImpl extends AbstractDao<User, Long> implements UserDao {
    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory, User.class);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery(
                    "from User u join fetch u.roles where u.email = :email", User.class)
                    .setParameter("email", email)
                    .uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get user by email= " + email
                + " from database", e);
        }
    }

    @Override
    public List<User> findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery(
                    "from User u join fetch u.roles", User.class)
                .getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get users from database", e);
        }
    }

    @Override
    public Optional<User> findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery(
                "from User u join fetch u.roles where u.id = :id", User.class)
                .setParameter("id", id)
                .uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get user by id= " + id
                + " from database", e);
        }
    }
}

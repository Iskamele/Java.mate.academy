package section09_Spring.topic02_BeanLifeCycle.theory.T03_SingletonAndPrototype.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import section09_Spring.topic02_BeanLifeCycle.theory.T03_SingletonAndPrototype.dao.UserDao;
import section09_Spring.topic02_BeanLifeCycle.theory.T03_SingletonAndPrototype.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(User user) {
        try (Session session = sessionFactory.openSession()) {
            session.save(user);
        }
    }

    @Override
    public User get(Long id) {
        return sessionFactory.openSession().get(User.class, id);
    }

    @Override
    public List<User> getAll() {
        TypedQuery query = sessionFactory.openSession()
                .createQuery("FROM User", User.class);
        return query.getResultList();
    }
}

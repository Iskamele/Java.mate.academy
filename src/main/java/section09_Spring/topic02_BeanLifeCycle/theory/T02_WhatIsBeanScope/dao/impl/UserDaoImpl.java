package section09_Spring.topic02_BeanLifeCycle.theory.T02_WhatIsBeanScope.dao.impl;

import java.util.List;
import section09_Spring.topic02_BeanLifeCycle.theory.T02_WhatIsBeanScope.dao.UserDao;
import section09_Spring.topic02_BeanLifeCycle.theory.T02_WhatIsBeanScope.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
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
    public User get(Long id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        try (Session session = sessionFactory.openSession()) {
            Query<User> query = session.createQuery(
                    "FROM User", User.class);
            return query.getResultList();
        }
    }
}

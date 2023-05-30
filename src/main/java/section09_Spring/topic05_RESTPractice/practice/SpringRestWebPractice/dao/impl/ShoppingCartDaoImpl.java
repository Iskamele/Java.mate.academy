package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao.impl;

import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao.AbstractDao;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao.ShoppingCartDao;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.exception.DataProcessingException;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.ShoppingCart;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class ShoppingCartDaoImpl extends AbstractDao<ShoppingCart> implements ShoppingCartDao {
    public ShoppingCartDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public ShoppingCart getByUser(User user) {
        try (Session session = sessionFactory.openSession()) {
            Query<ShoppingCart> query = session.createQuery(
                    "FROM ShoppingCart sc "
                            + "LEFT JOIN FETCH sc.tickets "
                            + "WHERE sc.user = :user", ShoppingCart.class);
            query.setParameter("user", user);
            return query.uniqueResult();
        } catch (Exception e) {
            throw new DataProcessingException("Cannot find shopping cart using user ", e);
        }
    }

    @Override
    public void update(ShoppingCart shoppingCart) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.update(shoppingCart);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Cannot update shopping cart ", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}

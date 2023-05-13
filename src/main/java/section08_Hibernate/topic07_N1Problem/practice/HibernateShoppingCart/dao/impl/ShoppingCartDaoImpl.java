package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.dao.impl;

import java.util.Optional;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.dao.ShoppingCartDao;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.exception.DataProcessingException;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.lib.Dao;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.ShoppingCart;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.User;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

@Dao
public class ShoppingCartDaoImpl implements ShoppingCartDao {
    @Override
    public ShoppingCart add(ShoppingCart shoppingCart) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(shoppingCart);
            transaction.commit();
            return shoppingCart;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't insert shopping cart " + shoppingCart, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Optional<ShoppingCart> getByUser(User user) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Query<ShoppingCart> getShoppingCart = session.createQuery("FROM ShoppingCart sc "
                    + "LEFT JOIN FETCH sc.tickets t "
                    + "WHERE sc.user = :user", ShoppingCart.class);
            getShoppingCart.setParameter("user", user);
            return Optional.ofNullable(getShoppingCart.getSingleResult());
        } catch (Exception e) {
            throw new DataProcessingException("Can't get shopping cart by user: "
                    + user, e);
        }
    }

    @Override
    public void update(ShoppingCart shoppingCart) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.merge(shoppingCart);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't update a shopping cart: " + shoppingCart, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}

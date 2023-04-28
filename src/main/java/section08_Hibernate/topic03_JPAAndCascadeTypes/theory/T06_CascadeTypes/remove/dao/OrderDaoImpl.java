package section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes.remove.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes.remove.model.Order;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes.util.HibernateUtil;

public class OrderDaoImpl implements OrderDao {
    @Override
    public Order save(Order order) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.persist(order);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't add order to DB for : " + order, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return order;
    }

    @Override
    public Order get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            return session.get(Order.class, id);
        } catch (Exception e) {
            throw new RuntimeException("Can't get order by ID: " + id, e);
        }
    }

    @Override
    public Order remove(Order order) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.remove(order);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't remove order from DB", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return order;
    }

    @Override
    public void update(Order order) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.merge(order);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't update order from DB", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}

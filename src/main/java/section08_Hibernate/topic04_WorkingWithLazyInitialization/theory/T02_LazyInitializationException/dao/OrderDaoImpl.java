package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.model.Order;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OrderDaoImpl implements OrderDao {
    @Override
    public Order save(Order entity) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't save order to DB", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return entity;
    }

    @Override
    public Order get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Order order = session.get(Order.class, id);
            Hibernate.initialize(order.getProducts());
            return order;
        }
    }
}

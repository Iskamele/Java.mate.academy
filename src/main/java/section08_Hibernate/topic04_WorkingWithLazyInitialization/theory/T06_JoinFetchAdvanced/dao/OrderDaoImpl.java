package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.model.Order;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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
            Query<Order> getOrderQuery = session.createQuery("FROM Order o " +
                    "LEFT JOIN FETCH o.products ops " +
                    "LEFT JOIN FETCH ops.reviews " +
                    "WHERE o.id = :id", Order.class);
            getOrderQuery.setParameter("id", id);
            return getOrderQuery.getSingleResult();
        }
    }
}

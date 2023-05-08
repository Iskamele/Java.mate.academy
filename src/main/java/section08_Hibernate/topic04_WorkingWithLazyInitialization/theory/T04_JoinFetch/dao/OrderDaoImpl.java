package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T04_JoinFetch.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T04_JoinFetch.model.Order;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T04_JoinFetch.model.User;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T04_JoinFetch.util.HibernateUtil;
import java.util.List;
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
                    "LEFT JOIN FETCH o.products " +
                    "WHERE o.id = :id", Order.class);
            getOrderQuery.setParameter("id", id);
            return getOrderQuery.getSingleResult();
        }
    }

    @Override
    public List<Order> findAll(User user) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Query<Order> getOrderQuery = session.createQuery("FROM Order o " +
                    "LEFT JOIN FETCH o.products " +
                    "WHERE o.owner = :owner", Order.class);
            getOrderQuery.setParameter("owner", user);
            return getOrderQuery.getResultList();
        }
    }
}

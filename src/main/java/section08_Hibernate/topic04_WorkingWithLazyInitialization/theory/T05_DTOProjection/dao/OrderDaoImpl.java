package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.model.Order;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.model.dto.OrdersByUserStatisticDto;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.util.HibernateUtil;
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

    /*
    SELECT u.login, COUNT(o.id)
    FROM orders o
    LEFT JOIN users u ON u.id = o.owner_id
    GROUP BY u.login;
     */
    @Override
    public List<OrdersByUserStatisticDto> getOrdersStatistic() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Query<OrdersByUserStatisticDto> getOrderStatisticQuery = session.createQuery(
                    "SELECT new section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.model.dto.OrdersByUserStatisticDto(u.login, COUNT(o.id)) " +
                            "FROM Order o " +
                            "LEFT JOIN o.owner u " +
                            "GROUP BY u.login", OrdersByUserStatisticDto.class);
            return getOrderStatisticQuery.getResultList();
        }
    }
}

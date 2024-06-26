package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.dao.impl;

import java.util.List;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.dao.OrderDao;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.exception.DataProcessingException;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.lib.Dao;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.Order;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.User;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

@Dao
public class OrderDaoImpl implements OrderDao {
    @Override
    public Order add(Order order) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(order);
            transaction.commit();
            return order;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't insert an order: " + order, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<Order> getByUser(User user) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Order> query = session.createQuery("FROM Order o "
                    + "LEFT JOIN FETCH o.tickets t "
                    + "LEFT JOIN FETCH t.movieSession ms "
                    + "LEFT JOIN FETCH ms.movie "
                    + "LEFT JOIN FETCH ms.cinemaHall "
                    + "LEFT JOIN FETCH o.user "
                    + "WHERE o.user =:user", Order.class);
            query.setParameter("user", user);
            return query.getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Can't find an order by user: " + user, e);
        }
    }
}

package section09_Spring.topic04_REST.practice.SpringRest.dao.impl;

import java.util.List;
import section09_Spring.topic04_REST.practice.SpringRest.dao.AbstractDao;
import section09_Spring.topic04_REST.practice.SpringRest.dao.OrderDao;
import section09_Spring.topic04_REST.practice.SpringRest.exception.DataProcessingException;
import section09_Spring.topic04_REST.practice.SpringRest.model.Order;
import section09_Spring.topic04_REST.practice.SpringRest.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl extends AbstractDao<Order> implements OrderDao {
    public OrderDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public List<Order> getOrdersHistory(User user) {
        try (Session session = sessionFactory.openSession()) {
            Query<Order> query = session.createQuery("select distinct o "
                    + "from Order o "
                    + "join fetch o.tickets "
                    + "join fetch o.user "
                    + "where o.user = :user", Order.class);
            query.setParameter("user", user);
            return query.getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Cannot find orders of user by user: " + "user", e);
        }
    }
}

package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao.impl;

import java.util.List;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao.AbstractDao;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao.OrderDao;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.exception.DataProcessingException;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.Order;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.User;
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
                    + "left join fetch o.tickets "
                    + "left join fetch o.user "
                    + "WHERE o.user = :user", Order.class);
            query.setParameter("user", user);
            return query.getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Cannot find orders of user by user: " + "user", e);
        }
    }
}

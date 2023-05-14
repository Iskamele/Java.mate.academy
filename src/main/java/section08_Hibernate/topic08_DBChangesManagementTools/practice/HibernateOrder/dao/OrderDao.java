package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.dao;

import java.util.List;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.User;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.Order;

public interface OrderDao {
    Order add(Order order);

    List<Order> getByUser(User user);
}

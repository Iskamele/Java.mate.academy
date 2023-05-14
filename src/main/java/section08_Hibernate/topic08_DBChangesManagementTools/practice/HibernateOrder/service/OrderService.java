package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service;

import java.util.List;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.Order;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.ShoppingCart;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}

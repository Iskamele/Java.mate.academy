package section09_Spring.topic04_REST.practice.SpringRest.dao;

import java.util.List;
import section09_Spring.topic04_REST.practice.SpringRest.model.Order;
import section09_Spring.topic04_REST.practice.SpringRest.model.User;

public interface OrderDao extends GenericDao<Order> {
    List<Order> getOrdersHistory(User user);
}

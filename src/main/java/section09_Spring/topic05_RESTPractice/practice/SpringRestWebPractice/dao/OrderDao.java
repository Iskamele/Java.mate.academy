package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao;

import java.util.List;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.Order;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.User;

public interface OrderDao extends GenericDao<Order> {
    List<Order> getOrdersHistory(User user);
}

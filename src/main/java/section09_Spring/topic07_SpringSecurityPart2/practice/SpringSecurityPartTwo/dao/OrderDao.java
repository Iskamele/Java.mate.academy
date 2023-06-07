package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao;

import java.util.List;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.Order;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}

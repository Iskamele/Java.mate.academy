package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dao;

import java.util.List;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.Order;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}

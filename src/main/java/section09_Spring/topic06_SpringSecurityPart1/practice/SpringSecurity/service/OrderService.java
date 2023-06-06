package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service;

import java.util.List;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.Order;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.ShoppingCart;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}

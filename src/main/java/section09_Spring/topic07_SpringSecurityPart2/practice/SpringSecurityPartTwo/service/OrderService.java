package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service;

import java.util.List;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.Order;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.ShoppingCart;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}

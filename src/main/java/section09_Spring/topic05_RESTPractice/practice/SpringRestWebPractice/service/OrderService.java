package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.service;

import java.util.List;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.Order;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.ShoppingCart;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}

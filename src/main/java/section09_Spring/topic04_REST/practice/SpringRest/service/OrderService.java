package section09_Spring.topic04_REST.practice.SpringRest.service;

import java.util.List;
import section09_Spring.topic04_REST.practice.SpringRest.model.Order;
import section09_Spring.topic04_REST.practice.SpringRest.model.ShoppingCart;
import section09_Spring.topic04_REST.practice.SpringRest.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}

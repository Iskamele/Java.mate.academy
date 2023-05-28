package section09_Spring.topic04_REST.practice.SpringRest.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import section09_Spring.topic04_REST.practice.SpringRest.dao.OrderDao;
import section09_Spring.topic04_REST.practice.SpringRest.model.Order;
import section09_Spring.topic04_REST.practice.SpringRest.model.ShoppingCart;
import section09_Spring.topic04_REST.practice.SpringRest.model.User;
import section09_Spring.topic04_REST.practice.SpringRest.service.OrderService;
import section09_Spring.topic04_REST.practice.SpringRest.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderDao orderDao;
    private final ShoppingCartService shoppingCartService;

    public OrderServiceImpl(OrderDao orderDao, ShoppingCartService shoppingCartService) {
        this.orderDao = orderDao;
        this.shoppingCartService = shoppingCartService;
    }

    @Override
    public Order completeOrder(ShoppingCart shoppingCart) {
        Order order = new Order();
        order.setUser(shoppingCart.getUser());
        order.setTickets(new ArrayList<>(shoppingCart.getTickets()));
        order.setOrderDate(LocalDateTime.now());
        shoppingCartService.clearShoppingCart(shoppingCart);
        return orderDao.add(order);
    }

    @Override
    public List<Order> getOrdersHistory(User user) {
        return orderDao.getOrdersHistory(user);
    }
}

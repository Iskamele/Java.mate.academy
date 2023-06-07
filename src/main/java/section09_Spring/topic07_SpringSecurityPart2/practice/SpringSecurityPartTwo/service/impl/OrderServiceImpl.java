package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.OrderDao;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.Order;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.ShoppingCart;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.User;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.OrderService;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.ShoppingCartService;

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
        order.setOrderTime(LocalDateTime.now());
        order.setTickets(shoppingCart.getTickets());
        order.setUser(shoppingCart.getUser());
        orderDao.add(order);
        shoppingCartService.clear(shoppingCart);
        return order;
    }

    @Override
    public List<Order> getOrdersHistory(User user) {
        return orderDao.getOrdersHistory(user);
    }
}

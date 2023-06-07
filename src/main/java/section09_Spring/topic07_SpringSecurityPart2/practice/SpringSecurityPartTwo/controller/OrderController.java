package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.controller;

import java.util.List;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dto.response.OrderResponseDto;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.Order;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.ShoppingCart;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.User;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.OrderService;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.ShoppingCartService;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.UserService;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.mapper.ResponseDtoMapper;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final ShoppingCartService shoppingCartService;
    private final OrderService orderService;
    private final UserService userService;
    private final ResponseDtoMapper<OrderResponseDto, Order> orderResponseDtoMapper;

    public OrderController(ShoppingCartService shoppingCartService,
                           OrderService orderService,
                           UserService userService,
                           ResponseDtoMapper<OrderResponseDto, Order> orderResponseDtoMapper) {
        this.shoppingCartService = shoppingCartService;
        this.orderService = orderService;
        this.userService = userService;
        this.orderResponseDtoMapper = orderResponseDtoMapper;
    }

    @PostMapping("/complete")
    public OrderResponseDto completeOrder(Authentication auth) {
        String email = auth.getName();
        User user = userService.findByEmail(email).orElseThrow(
                () -> new RuntimeException("User with email " + email + " not found"));
        ShoppingCart cart = shoppingCartService.getByUser(user);
        return orderResponseDtoMapper.mapToDto(orderService.completeOrder(cart));
    }

    @GetMapping
    public List<OrderResponseDto> getOrderHistory(Authentication auth) {
        String email = auth.getName();
        User user = userService.findByEmail(email).orElseThrow(
                () -> new RuntimeException("User with email " + email + " not found"));
        return orderService.getOrdersHistory(user)
                .stream()
                .map(orderResponseDtoMapper::mapToDto)
                .toList();
    }
}

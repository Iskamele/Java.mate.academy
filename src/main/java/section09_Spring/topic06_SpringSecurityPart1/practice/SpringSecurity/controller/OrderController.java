package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dto.response.OrderResponseDto;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.Order;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.ShoppingCart;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.OrderService;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.ShoppingCartService;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.UserService;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.mapper.ResponseDtoMapper;

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
    public OrderResponseDto completeOrder(@RequestParam Long userId) {
        ShoppingCart cart = shoppingCartService.getByUser(userService.get(userId));
        return orderResponseDtoMapper.mapToDto(orderService.completeOrder(cart));
    }

    @GetMapping
    public List<OrderResponseDto> getOrderHistory(@RequestParam Long userId) {
        return orderService.getOrdersHistory(userService.get(userId))
                .stream()
                .map(orderResponseDtoMapper::mapToDto)
                .toList();
    }
}

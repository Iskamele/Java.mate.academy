package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.controller;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public OrderResponseDto completeOrder(Authentication authentication) {
        ShoppingCart cart = shoppingCartService.getByUser(
                userService.findByEmail(authentication.getName()).orElseThrow(() ->
                        new NoSuchElementException("Couldn't complete order for: "
                                + authentication.getName())));
        return orderResponseDtoMapper.mapToDto(orderService.completeOrder(cart));
    }

    @GetMapping
    public List<OrderResponseDto> getOrderHistory(Authentication authentication) {
        return orderService.getOrdersHistory(
                        userService.findByEmail(authentication.getName()).orElseThrow(() ->
                                new NoSuchElementException("Couldn't get order history for: "
                                        + authentication.getName())))
                .stream()
                .map(orderResponseDtoMapper::mapToDto)
                .toList();
    }
}

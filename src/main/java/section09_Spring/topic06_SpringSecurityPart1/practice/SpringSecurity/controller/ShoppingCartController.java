package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.controller;

import java.util.NoSuchElementException;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dto.response.ShoppingCartResponseDto;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.ShoppingCart;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.User;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.MovieSessionService;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.ShoppingCartService;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.UserService;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.mapper.ResponseDtoMapper;

@RestController
@RequestMapping("/shopping-carts")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;
    private final MovieSessionService movieSessionService;
    private final UserService userService;
    private final ResponseDtoMapper<ShoppingCartResponseDto, ShoppingCart>
            shoppingCartResponseDtoMapper;

    public ShoppingCartController(ShoppingCartService shoppingCartService,
                                  UserService userService,
                                  MovieSessionService movieSessionService,
                                  ResponseDtoMapper<ShoppingCartResponseDto, ShoppingCart>
                                          shoppingCartResponseDtoMapper) {
        this.shoppingCartService = shoppingCartService;
        this.userService = userService;
        this.movieSessionService = movieSessionService;
        this.shoppingCartResponseDtoMapper = shoppingCartResponseDtoMapper;
    }

    @PutMapping("/movie-sessions")
    public void addToCart(Authentication authentication, @RequestParam Long movieSessionId) {
        shoppingCartService.addSession(
                movieSessionService.get(movieSessionId),
                getUser(authentication));
    }

    @GetMapping("/by-user")
    public ShoppingCartResponseDto getByUser(Authentication authentication) {
        return shoppingCartResponseDtoMapper.mapToDto(
                shoppingCartService.getByUser(getUser(authentication)));
    }

    private User getUser(Authentication authentication) {
        return userService.findByEmail(authentication.getName()).orElseThrow(() ->
                new NoSuchElementException("Couldn't find shopping cart for: "
                        + authentication.getName()));
    }
}

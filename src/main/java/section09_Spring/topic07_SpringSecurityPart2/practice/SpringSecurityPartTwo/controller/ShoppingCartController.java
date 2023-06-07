package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dto.response.ShoppingCartResponseDto;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.MovieSession;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.ShoppingCart;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.User;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.MovieSessionService;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.ShoppingCartService;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.UserService;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service.mapper.ResponseDtoMapper;

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
    public void addToCart(Authentication auth, @RequestParam Long movieSessionId) {
        UserDetails details = (UserDetails) auth.getPrincipal();
        String email = details.getUsername();
        User user = userService.findByEmail(email).orElseThrow(
                () -> new RuntimeException("User with email " + email + " not found"));
        MovieSession movieSession = movieSessionService.get(movieSessionId);
        shoppingCartService.addSession(movieSession, user);
    }

    @GetMapping("/by-user")
    public ShoppingCartResponseDto getByUser(Authentication auth) {
        UserDetails details = (UserDetails) auth.getPrincipal();
        String email = details.getUsername();
        User user = userService.findByEmail(email).orElseThrow(
                () -> new RuntimeException("User with email " + email + " not found"));
        return shoppingCartResponseDtoMapper.mapToDto(shoppingCartService.getByUser(user));
    }
}

package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.impl;

import java.util.Optional;
import org.springframework.stereotype.Service;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.exception.AuthenticationException;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.User;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.AuthenticationService;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.ShoppingCartService;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.UserService;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.util.HashUtil;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
    }

    @Override
    public User login(String email, String password) throws AuthenticationException {
        Optional<User> user = userService.findByEmail(email);
        if (user.isPresent() && user.get().getPassword().equals(
                HashUtil.generateSecurePassword(password, user.get().getSalt()))) {
            return user.get();
        }
        throw new AuthenticationException("Invalid login or password");
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}

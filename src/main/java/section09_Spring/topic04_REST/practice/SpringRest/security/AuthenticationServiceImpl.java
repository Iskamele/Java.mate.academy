package section09_Spring.topic04_REST.practice.SpringRest.security;

import java.util.Optional;
import section09_Spring.topic04_REST.practice.SpringRest.exception.AuthenticationException;
import section09_Spring.topic04_REST.practice.SpringRest.model.User;
import section09_Spring.topic04_REST.practice.SpringRest.service.ShoppingCartService;
import section09_Spring.topic04_REST.practice.SpringRest.service.UserService;
import section09_Spring.topic04_REST.practice.SpringRest.util.HashUtil;
import org.springframework.stereotype.Component;

@Component
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
        Optional<User> userFromDb = userService.findByEmail(email);
        if (userFromDb.isPresent() && matchPasswords(password, userFromDb.get())) {
            return userFromDb.get();
        }
        throw new AuthenticationException("Incorrect email or password!");
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

    private boolean matchPasswords(String rawPassword, User userFromDb) {
        String hashedPassword = HashUtil.hashPassword(rawPassword, userFromDb.getSalt());
        return hashedPassword.equals(userFromDb.getPassword());
    }
}

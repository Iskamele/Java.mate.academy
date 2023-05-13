package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.security;

import java.util.Optional;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.exception.AuthenticationException;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.exception.RegistrationException;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.lib.Inject;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.lib.Service;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.User;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.service.ShoppingCartService;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.service.UserService;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.util.HashUtil;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private UserService userService;
    @Inject
    private ShoppingCartService shoppingCartService;

    @Override
    public User login(String email, String password) throws AuthenticationException {
        Optional<User> userFromDb = userService.findByEmail(email);
        if (userFromDb.isPresent() && matchPasswords(password, userFromDb.get())) {
            return userFromDb.get();
        }
        throw new AuthenticationException("Incorrect email or password!");
    }

    @Override
    public User register(String email, String password) throws RegistrationException {
        if (userService.findByEmail(email).isEmpty()) {
            User user = new User();
            user.setEmail(email);
            user.setPassword(password);
            userService.add(user);
            shoppingCartService.registerNewShoppingCart(user);
            return user;
        }
        throw new RegistrationException("This email is already registered.");
    }

    private boolean matchPasswords(String rawPassword, User userFromDb) {
        String hashedPassword = HashUtil.hashPassword(rawPassword, userFromDb.getSalt());
        return hashedPassword.equals(userFromDb.getPassword());
    }
}

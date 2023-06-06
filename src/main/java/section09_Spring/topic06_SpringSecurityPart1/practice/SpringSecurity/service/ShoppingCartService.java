package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service;

import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.MovieSession;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.ShoppingCart;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}

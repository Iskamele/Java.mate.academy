package section09_Spring.topic04_REST.practice.SpringRest.service;

import section09_Spring.topic04_REST.practice.SpringRest.model.MovieSession;
import section09_Spring.topic04_REST.practice.SpringRest.model.ShoppingCart;
import section09_Spring.topic04_REST.practice.SpringRest.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clearShoppingCart(ShoppingCart cart);
}

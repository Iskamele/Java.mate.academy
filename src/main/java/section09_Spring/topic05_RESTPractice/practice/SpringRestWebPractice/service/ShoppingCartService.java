package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.service;

import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.MovieSession;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.ShoppingCart;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clearShoppingCart(ShoppingCart cart);
}

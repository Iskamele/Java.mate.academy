package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.service;

import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.MovieSession;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.ShoppingCart;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}

package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.dao;

import java.util.Optional;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.ShoppingCart;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    Optional<ShoppingCart> getByUser(User user);

    void update(ShoppingCart shoppingCart);
}

package section09_Spring.topic04_REST.practice.SpringRest.dao;

import section09_Spring.topic04_REST.practice.SpringRest.model.ShoppingCart;
import section09_Spring.topic04_REST.practice.SpringRest.model.User;

public interface ShoppingCartDao extends GenericDao<ShoppingCart> {
    ShoppingCart getByUser(User user);

    void update(ShoppingCart shoppingCart);
}

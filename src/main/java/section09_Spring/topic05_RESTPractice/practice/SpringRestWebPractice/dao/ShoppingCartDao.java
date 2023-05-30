package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao;

import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.ShoppingCart;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.User;

public interface ShoppingCartDao extends GenericDao<ShoppingCart> {
    ShoppingCart getByUser(User user);

    void update(ShoppingCart shoppingCart);
}

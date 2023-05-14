package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.dao;

import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.ShoppingCart;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    void update(ShoppingCart shoppingCart);
}

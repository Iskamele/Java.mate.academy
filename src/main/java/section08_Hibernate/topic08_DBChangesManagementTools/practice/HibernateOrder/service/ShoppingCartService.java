package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service;

import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.MovieSession;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.ShoppingCart;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.User;


public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clearShoppingCart(ShoppingCart cart);
}

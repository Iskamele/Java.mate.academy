package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service.impl;

import java.util.ArrayList;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.dao.ShoppingCartDao;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.dao.TicketDao;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.lib.Inject;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.lib.Service;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.MovieSession;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.ShoppingCart;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.User;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.Ticket;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Inject
    private ShoppingCartDao shoppingCartDao;
    @Inject
    private TicketDao ticketDao;

    @Override
    public void addSession(MovieSession movieSession, User user) {
        Ticket newTicket = new Ticket();
        newTicket.setUser(user);
        newTicket.setMovieSession(movieSession);

        ShoppingCart shoppingCart = shoppingCartDao.getByUser(user);
        shoppingCart.getTickets().add(ticketDao.add(newTicket));
        shoppingCartDao.update(shoppingCart);
    }

    @Override
    public ShoppingCart getByUser(User user) {
        return shoppingCartDao.getByUser(user);
    }

    @Override
    public void registerNewShoppingCart(User user) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setUser(user);
        shoppingCartDao.add(shoppingCart);
    }

    @Override
    public void clearShoppingCart(ShoppingCart cart) {
        cart.setTickets(new ArrayList<>());
        shoppingCartDao.update(cart);
    }
}

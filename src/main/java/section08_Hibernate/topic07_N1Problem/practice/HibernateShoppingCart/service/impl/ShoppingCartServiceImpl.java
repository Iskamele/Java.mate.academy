package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.service.impl;

import java.util.Collections;
import java.util.NoSuchElementException;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.dao.ShoppingCartDao;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.dao.TicketDao;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.lib.Inject;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.lib.Service;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.MovieSession;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.ShoppingCart;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.Ticket;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.User;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Inject
    private ShoppingCartDao shoppingCartDao;
    @Inject
    private TicketDao ticketDao;

    @Override
    public void addSession(MovieSession movieSession, User user) {
        Ticket ticket = new Ticket();
        ticket.setUser(user);
        ticket.setMovieSession(movieSession);
        ticketDao.add(ticket);
        ShoppingCart shoppingCart = getByUser(user);
        shoppingCart.getTickets().add(ticket);
        shoppingCartDao.update(shoppingCart);
    }

    @Override
    public ShoppingCart getByUser(User user) {
        return shoppingCartDao.getByUser(user).orElseThrow(() ->
                new NoSuchElementException("Can't get shopping cart by user: " + user));
    }

    @Override
    public void registerNewShoppingCart(User user) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setUser(user);
        shoppingCartDao.add(shoppingCart);
    }

    @Override
    public void clear(ShoppingCart shoppingCart) {
        shoppingCart.setTickets(Collections.emptyList());
        shoppingCartDao.update(shoppingCart);
    }
}

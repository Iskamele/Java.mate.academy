package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.service.impl;

import java.util.ArrayList;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao.ShoppingCartDao;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao.TicketDao;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.MovieSession;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.ShoppingCart;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.Ticket;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.User;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    private final TicketDao ticketDao;
    private final ShoppingCartDao shoppingCartDao;

    public ShoppingCartServiceImpl(TicketDao ticketDao,
                                   ShoppingCartDao shoppingCartDao) {
        this.ticketDao = ticketDao;
        this.shoppingCartDao = shoppingCartDao;
    }

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

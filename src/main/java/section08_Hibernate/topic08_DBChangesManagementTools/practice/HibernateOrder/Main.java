package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.exception.AuthenticationException;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.exception.RegistrationException;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.lib.Injector;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.CinemaHall;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.Movie;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.MovieSession;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.ShoppingCart;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.User;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.security.AuthenticationService;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service.CinemaHallService;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service.MovieService;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service.MovieSessionService;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service.OrderService;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service.ShoppingCartService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) throws RegistrationException, AuthenticationException {
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);

        Movie fastAndFurious = new Movie("Fast and Furious");
        fastAndFurious.setDescription("An action film about street racing, heists, and spies.");
        movieService.add(fastAndFurious);
        System.out.println(movieService.get(fastAndFurious.getId()));
        movieService.getAll().forEach(System.out::println);

        CinemaHall firstCinemaHall = new CinemaHall();
        firstCinemaHall.setCapacity(100);
        firstCinemaHall.setDescription("first hall with capacity 100");

        CinemaHall secondCinemaHall = new CinemaHall();
        secondCinemaHall.setCapacity(200);
        secondCinemaHall.setDescription("second hall with capacity 200");

        CinemaHallService cinemaHallService =
                (CinemaHallService) injector.getInstance(CinemaHallService.class);
        cinemaHallService.add(firstCinemaHall);
        cinemaHallService.add(secondCinemaHall);

        System.out.println(cinemaHallService.getAll());
        System.out.println(cinemaHallService.get(firstCinemaHall.getId()));

        MovieSession tomorrowMovieSession = new MovieSession();
        tomorrowMovieSession.setCinemaHall(firstCinemaHall);
        tomorrowMovieSession.setMovie(fastAndFurious);
        tomorrowMovieSession.setShowTime(LocalDateTime.now().plusDays(1L));

        MovieSession yesterdayMovieSession = new MovieSession();
        yesterdayMovieSession.setCinemaHall(firstCinemaHall);
        yesterdayMovieSession.setMovie(fastAndFurious);
        yesterdayMovieSession.setShowTime(LocalDateTime.now().minusDays(1L));

        MovieSessionService movieSessionService =
                (MovieSessionService) injector.getInstance(MovieSessionService.class);
        movieSessionService.add(tomorrowMovieSession);
        movieSessionService.add(yesterdayMovieSession);

        System.out.println(movieSessionService.get(yesterdayMovieSession.getId()));
        System.out.println(movieSessionService.findAvailableSessions(
                fastAndFurious.getId(), LocalDate.now()));

        AuthenticationService authenticationService =
                (AuthenticationService) injector.getInstance(AuthenticationService.class);
        authenticationService.register("bob@gmail.com", "qwerty");
        authenticationService.register("alice@gmail.com", "123456");
        User loginBob = authenticationService.login("bob@gmail.com", "qwerty");
        User loginAlice = authenticationService.login("alice@gmail.com", "123456");

        ShoppingCartService shoppingCartService =
                (ShoppingCartService) injector.getInstance(ShoppingCartService.class);
        shoppingCartService.addSession(tomorrowMovieSession, loginBob);
        shoppingCartService.addSession(yesterdayMovieSession, loginBob);
        shoppingCartService.addSession(yesterdayMovieSession, loginAlice);

        ShoppingCart bobShoppingCart = shoppingCartService.getByUser(loginBob);
        ShoppingCart aliceShoppingCart = shoppingCartService.getByUser(loginAlice);

        OrderService orderService =
                (OrderService) injector.getInstance(OrderService.class);
        orderService.completeOrder(bobShoppingCart);
        orderService.completeOrder(aliceShoppingCart);
        System.out.println(orderService.getOrdersHistory(loginBob));
        System.out.println(orderService.getOrdersHistory(loginAlice));
    }
}

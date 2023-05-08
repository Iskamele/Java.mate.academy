package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.dao.OrderDao;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.dao.OrderDaoImpl;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.dao.UserDao;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.dao.UserDaoImpl;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.model.Order;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.model.User;

public class Main {

    public static void main(String[] args) {

        // inject data to DB
        injectAliceOrders();
        injectJohnOrders();
        injectBobOrders();

        OrderDao orderDao = new OrderDaoImpl();
        System.out.println("Statistic: " + orderDao.getOrdersStatistic());
    }

    private static void injectBobOrders() {
        // save user
        User bob = new User();
        bob.setLogin("Bob");
        bob.setPassword("1234");
        UserDao userDao = new UserDaoImpl();
        userDao.save(bob);

        // save order
        OrderDao orderDao = new OrderDaoImpl();
        orderDao.save(new Order(bob));
        orderDao.save(new Order(bob));
        orderDao.save(new Order(bob));
    }

    private static void injectJohnOrders() {
        // save user
        User john = new User();
        john.setLogin("John");
        john.setPassword("1234");
        UserDao userDao = new UserDaoImpl();
        userDao.save(john);

        // save order
        OrderDao orderDao = new OrderDaoImpl();
        orderDao.save(new Order(john));
        orderDao.save(new Order(john));
    }

    private static void injectAliceOrders() {
        // save user
        User alice = new User();
        alice.setLogin("Alice");
        alice.setPassword("1234");
        UserDao userDao = new UserDaoImpl();
        userDao.save(alice);

        // save order
        OrderDao orderDao = new OrderDaoImpl();
        orderDao.save(new Order(alice));
        orderDao.save(new Order(alice));
        orderDao.save(new Order(alice));
        orderDao.save(new Order(alice));
        orderDao.save(new Order(alice));
    }

}

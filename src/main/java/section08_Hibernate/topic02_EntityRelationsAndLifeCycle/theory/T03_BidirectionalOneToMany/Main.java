package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T03_BidirectionalOneToMany;

import java.time.LocalDateTime;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T03_BidirectionalOneToMany.dao.OrderDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T03_BidirectionalOneToMany.dao.OrderDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T03_BidirectionalOneToMany.dao.UserDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T03_BidirectionalOneToMany.dao.UserDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T03_BidirectionalOneToMany.model.Order;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T03_BidirectionalOneToMany.model.User;

public class Main {

//    public static void main(String[] args) {
//        // Save Order to DB
//        Order order = new Order();
//        order.setOrderDate(LocalDateTime.now());
//        OrderDao orderDao = new OrderDaoImpl();
//        orderDao.save(order);
//        Order orderFromDb = orderDao.get(1L);
//
//        // Save user to DB
//        User bob = new User();
//        bob.setLogin("Bob");
//        bob.setPassword("1234");
//        bob.setOrders(List.of(orderFromDb));
//        UserDao userDao = new UserDaoImpl();
//        userDao.save(bob);
//        System.out.println(userDao.get(1L));
//    }

    public static void main(String[] args) {
        // Save user to DB
        User bob = new User();
        bob.setLogin("Bob");
        bob.setPassword("1234");
        UserDao userDao = new UserDaoImpl();
        userDao.save(bob);
        System.out.println(userDao.get(1L));

        // Save Order to DB
        Order order = new Order();
        order.setOrderDate(LocalDateTime.now());
        order.setOwner(bob);
        OrderDao orderDao = new OrderDaoImpl();
        orderDao.save(order);
    }
}

package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.OneToMany;

import java.time.LocalDateTime;
import java.util.List;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.OneToMany.dao.OrderDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.OneToMany.dao.OrderDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.OneToMany.dao.UserDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.OneToMany.dao.UserDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.OneToMany.model.Order;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.OneToMany.model.User;

public class Main {

    public static void main(String[] args) {
        // Save Order to DB
        Order order = new Order();
        order.setOrderDate(LocalDateTime.now());
        OrderDao orderDao = new OrderDaoImpl();
        orderDao.save(order);
        Order orderFromDb = orderDao.get(1L);

        System.out.println(orderFromDb);

        // Save user to DB
        User bob = new User();
        bob.setLogin("Bob");
        bob.setPassword("1234");
        UserDao userDao = new UserDaoImpl();
        bob.setOrders(List.of(orderFromDb));
        userDao.save(bob);
        System.out.println(userDao.get(1L));
    }
}

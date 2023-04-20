package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.ManyToOne;

import java.time.LocalDateTime;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.ManyToOne.dao.OrderDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.ManyToOne.dao.OrderDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.ManyToOne.dao.UserDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.ManyToOne.dao.UserDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.ManyToOne.model.Order;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.ManyToOne.model.User;

public class Main {

    public static void main(String[] args) {
        // Save user to DB
        User bob = new User();
        bob.setLogin("Bob");
        bob.setPassword("1234");
        UserDao userDao = new UserDaoImpl();
        User bobFromDb = userDao.save(bob);

        // Save Order to DB
        Order order = new Order();
        order.setOrderDate(LocalDateTime.now());
        order.setOwner(bobFromDb);
        OrderDao orderDao = new OrderDaoImpl();
        orderDao.save(order);

        System.out.println(orderDao.get(1L));
    }
}

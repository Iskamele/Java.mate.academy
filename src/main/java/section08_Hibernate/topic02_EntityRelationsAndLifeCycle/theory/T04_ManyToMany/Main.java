package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T04_ManyToMany;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T04_ManyToMany.dao.OrderDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T04_ManyToMany.dao.OrderDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T04_ManyToMany.dao.ProductDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T04_ManyToMany.dao.ProductDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T04_ManyToMany.dao.UserDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T04_ManyToMany.dao.UserDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T04_ManyToMany.model.Order;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T04_ManyToMany.model.Product;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T04_ManyToMany.model.User;

public class Main {

    public static void main(String[] args) {
        ProductDao productDao = new ProductDaoImpl();

        Product iPhone = new Product();
        iPhone.setName("iPhone X");
        iPhone.setPrice(BigDecimal.valueOf(999));

        productDao.save(iPhone);

        Product productFromDB = productDao.get(1L);
        System.out.println(productFromDB);

        User bob = new User();
        bob.setLogin("Bob");
        bob.setPassword("1234");
        UserDao userDao = new UserDaoImpl();
        userDao.save(bob);

        User bobFromDB = userDao.get(1L);

        Order order = new Order();
        order.setOrderDate(LocalDateTime.now());
        order.setOwner(bobFromDB);
        order.setProducts(List.of(productFromDB));

        OrderDao orderDao = new OrderDaoImpl();
        orderDao.save(order);

        System.out.println(orderDao.get(1L));
    }
}

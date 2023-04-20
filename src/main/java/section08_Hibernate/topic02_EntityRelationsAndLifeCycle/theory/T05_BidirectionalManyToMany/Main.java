package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T05_BidirectionalManyToMany;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T05_BidirectionalManyToMany.dao.OrderDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T05_BidirectionalManyToMany.dao.OrderDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T05_BidirectionalManyToMany.dao.ProductDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T05_BidirectionalManyToMany.dao.ProductDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T05_BidirectionalManyToMany.dao.UserDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T05_BidirectionalManyToMany.dao.UserDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T05_BidirectionalManyToMany.model.Order;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T05_BidirectionalManyToMany.model.Product;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T05_BidirectionalManyToMany.model.User;

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

        Order newOrder = new Order();
        orderDao.save(newOrder);

        Product tv = new Product();
        tv.setName("TV");
        tv.setPrice(BigDecimal.TEN);
        tv.setOrders(List.of(orderDao.get(2L)));
        productDao.save(tv);
    }
}

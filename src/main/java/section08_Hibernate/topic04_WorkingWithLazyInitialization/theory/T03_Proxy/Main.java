package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T03_Proxy;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.dao.OrderDao;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.dao.OrderDaoImpl;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.dao.ProductDao;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.dao.ProductDaoImpl;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.dao.UserDao;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.dao.UserDaoImpl;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.model.Order;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.model.Product;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.model.User;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // save products
        Product iPhone = new Product();
        iPhone.setName("iPhone X");
        iPhone.setPrice(BigDecimal.valueOf(999));

        ProductDao productDao = new ProductDaoImpl();
        productDao.save(iPhone);

        // save user
        User bob = new User();
        bob.setLogin("Bob");
        bob.setPassword("1234");
        UserDao userDao = new UserDaoImpl();
        userDao.save(bob);

        // create order
        Order order = new Order();
        order.setOrderDate(LocalDateTime.now());
        order.setOwner(bob);
        order.setProducts(List.of(iPhone));

        // save order
        OrderDao orderDao = new OrderDaoImpl();
        orderDao.save(order);

        // print order
        Order orderFromDb = orderDao.get(order.getId());
        System.out.println(orderFromDb.getProducts().size());
        System.out.println(orderFromDb);

        // FetchType.EAGER - не лучшее решение. Вытягиваться может очень много данных
        // Hibernate.initialize() - тоже не best practice
        // join fetch - лучшее решение
    }
}

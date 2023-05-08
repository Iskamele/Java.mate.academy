package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.dao.OrderDao;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.dao.OrderDaoImpl;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.dao.ProductDao;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.dao.ProductDaoImpl;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.dao.ReviewDao;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.dao.ReviewDaoImpl;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.dao.UserDao;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.dao.UserDaoImpl;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.model.Order;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.model.Product;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.model.Review;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.model.User;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // save review
        Review iPhoneReview = new Review("Awesome phone", null);
        ReviewDao reviewDao = new ReviewDaoImpl();
        reviewDao.save(iPhoneReview);

        // save products
        Product iPhone = new Product();
        iPhone.setName("iPhone X");
        iPhone.setPrice(BigDecimal.valueOf(999));
        iPhone.setReviews(Set.of(iPhoneReview));

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
        order.setProducts(Set.of(iPhone));

        // save order
        OrderDao orderDao = new OrderDaoImpl();
        orderDao.save(order);

        // print order
        Order orderFromDb = orderDao.get(order.getId());
        System.out.println("The count of products in this order = " + orderFromDb.getProducts().size());
        System.out.println(orderFromDb);

        for (Product product : orderFromDb.getProducts()) {
            System.out.println(product.getReviews());
        }
    }
}

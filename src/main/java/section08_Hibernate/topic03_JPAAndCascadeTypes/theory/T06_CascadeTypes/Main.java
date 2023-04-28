package section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes.persist.dao.OrderDao;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes.persist.dao.OrderDaoImpl;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes.persist.model.Order;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes.persist.model.Product;

public class Main {

    public static void main(String[] args) {
        Product iPhone = new Product();
        iPhone.setName("iPhone 12");
        iPhone.setPrice(BigDecimal.valueOf(1500));

        Order order = new Order();
        List<Product> products = new ArrayList<>();
        products.add(iPhone);
        order.setProducts(products);

        OrderDao orderDao = new OrderDaoImpl();
        orderDao.save(order);

        System.out.println(orderDao.get(1L));
    }
}

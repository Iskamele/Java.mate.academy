package section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes.merge.dao.OrderDao;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes.merge.dao.OrderDaoImpl;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes.merge.model.Order;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes.merge.model.Product;

public class MergeExample {

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

        Product product = order.getProducts().get(0);
        product.setPrice(BigDecimal.valueOf(1299));

        orderDao.update(order);
    }
}
package section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes.remove.dao.OrderDao;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes.remove.dao.OrderDaoImpl;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes.remove.model.Order;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes.remove.model.Product;

public class RemoveExample {

    public static void main(String[] args) {
        Product iPhone = new Product();
        iPhone.setName("iPhone 11");
        iPhone.setPrice(BigDecimal.valueOf(1390));

        Order order = new Order();
        List<Product> products = new ArrayList<>();
        products.add(iPhone);
        order.setProducts(products);

        OrderDao orderDao = new OrderDaoImpl();
        orderDao.save(order);

        orderDao.remove(order);
    }
}

package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T08_EntityStatesEntityLifeCycle;

import java.math.BigDecimal;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T08_EntityStatesEntityLifeCycle.dao.OrderDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T08_EntityStatesEntityLifeCycle.dao.OrderDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T08_EntityStatesEntityLifeCycle.dao.ProductDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T08_EntityStatesEntityLifeCycle.dao.ProductDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T08_EntityStatesEntityLifeCycle.dao.UserDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T08_EntityStatesEntityLifeCycle.dao.UserDaoImpl;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T08_EntityStatesEntityLifeCycle.model.Order;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T08_EntityStatesEntityLifeCycle.model.Product;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T08_EntityStatesEntityLifeCycle.model.User;

public class Main {

    public static void main(String[] args) {
        ProductDao productDao = new ProductDaoImpl();

        Product iPhone = new Product();
        iPhone.setName("iPhone X");
        iPhone.setPrice(BigDecimal.valueOf(999));

        UserDao userDao = new UserDaoImpl();
        User savedUser = userDao.save(new User());
        OrderDao orderDao = new OrderDaoImpl();
        Order order = new Order();
        order.setOwner(savedUser);

        orderDao.save(order);
    }
}

package section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T03_JPABasedDAOImplementation;

import java.math.BigDecimal;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T03_JPABasedDAOImplementation.dao.ProductDao;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T03_JPABasedDAOImplementation.dao.ProductDaoImpl;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T03_JPABasedDAOImplementation.model.Product;

public class Main {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDaoImpl();

        Product iPhone = new Product();
        iPhone.setName("iPhone 13");
        iPhone.setPrice(BigDecimal.valueOf(1500));

        Product savedProduct = productDao.save(iPhone);
        System.out.println(savedProduct);
    }
}

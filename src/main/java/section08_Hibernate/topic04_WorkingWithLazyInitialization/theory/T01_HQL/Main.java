package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T01_HQL;

import java.math.BigDecimal;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T01_HQL.dao.ProductDao;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T01_HQL.dao.ProductDaoImpl;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T01_HQL.model.Product;

public class Main {

    public static void main(String[] args) {
        // create products
        Product iPhone = new Product();
        iPhone.setName("iPhone X");
        iPhone.setPrice(BigDecimal.valueOf(999));

        Product samsung = new Product();
        samsung.setName("Samsung S20");
        samsung.setPrice(BigDecimal.valueOf(899));

        // save products
        ProductDao productDao = new ProductDaoImpl();
        productDao.save(iPhone);
        productDao.save(samsung);

        // print products
        System.out.println(productDao.findAll());

        System.out.println(productDao.findAllWherePriceGreaterThan(BigDecimal.valueOf(950)));
    }
}

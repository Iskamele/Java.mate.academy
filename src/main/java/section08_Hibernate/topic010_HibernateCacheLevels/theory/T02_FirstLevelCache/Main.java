package section08_Hibernate.topic010_HibernateCacheLevels.theory.T02_FirstLevelCache;

import java.math.BigDecimal;
import section08_Hibernate.topic010_HibernateCacheLevels.theory.T02_FirstLevelCache.dao.ProductDao;
import section08_Hibernate.topic010_HibernateCacheLevels.theory.T02_FirstLevelCache.dao.impl.ProductDaoImpl;
import section08_Hibernate.topic010_HibernateCacheLevels.theory.T02_FirstLevelCache.model.Product;
import section08_Hibernate.topic010_HibernateCacheLevels.theory.T02_FirstLevelCache.util.HibernateUtil;

public class Main {

    public static void main(String[] args) {
        // create products
        Product iPhone = new Product();
        iPhone.setName("iPhone 7");
        iPhone.setPrice(BigDecimal.valueOf(499));

        // save products
        ProductDao productDao = new ProductDaoImpl(HibernateUtil.getSessionFactory());
        productDao.save(iPhone);

        // print products
        System.out.println(productDao.get(iPhone.getId()));
    }
}

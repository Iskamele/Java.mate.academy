package section08_Hibernate.topic08_DBChangesManagementTools.theory.T01_DatabaseChangeManagementTools;

import java.math.BigDecimal;
import section08_Hibernate.topic08_DBChangesManagementTools.theory.T01_DatabaseChangeManagementTools.dao.ProductDao;
import section08_Hibernate.topic08_DBChangesManagementTools.theory.T01_DatabaseChangeManagementTools.dao.impl.ProductDaoImpl;
import section08_Hibernate.topic08_DBChangesManagementTools.theory.T01_DatabaseChangeManagementTools.model.Product;

public class Main {

    public static void main(String[] args) {
        // create products
        Product iPhone = new Product();
        iPhone.setName("iPhone 7");
        iPhone.setPrice(BigDecimal.valueOf(499));

        Product samsung = new Product();
        samsung.setName("Samsung S20");
        samsung.setPrice(BigDecimal.valueOf(695));

        // save products
        ProductDao productDao = new ProductDaoImpl();
        productDao.save(iPhone);
        productDao.save(samsung);

        // print products
        System.out.println(productDao.findAll());
    }
}

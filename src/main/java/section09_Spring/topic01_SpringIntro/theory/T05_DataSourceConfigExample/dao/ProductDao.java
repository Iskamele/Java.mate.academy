package section09_Spring.topic01_SpringIntro.theory.T05_DataSourceConfigExample.dao;

import section09_Spring.topic01_SpringIntro.theory.T05_DataSourceConfigExample.model.Product;
import java.util.List;

public interface ProductDao {
    Product save(Product product);

    List<Product> findAll();
}

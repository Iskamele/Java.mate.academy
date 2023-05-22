package section09_Spring.topic01_SpringIntro.theory.T06_PropertiesFileUsage.dao;

import section09_Spring.topic01_SpringIntro.theory.T06_PropertiesFileUsage.model.Product;
import java.util.List;

public interface ProductDao {
    Product save(Product product);

    List<Product> findAll();
}

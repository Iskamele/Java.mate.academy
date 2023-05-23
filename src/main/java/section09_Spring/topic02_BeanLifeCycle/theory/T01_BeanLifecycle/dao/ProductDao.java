package section09_Spring.topic02_BeanLifeCycle.theory.T01_BeanLifecycle.dao;

import java.util.List;
import section09_Spring.topic02_BeanLifeCycle.theory.T01_BeanLifecycle.model.Product;

public interface ProductDao {
    Product save(Product product);

    List<Product> findAll();
}

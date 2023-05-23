package section09_Spring.topic02_BeanLifeCycle.theory.T01_BeanLifecycle.service;

import java.util.List;
import section09_Spring.topic02_BeanLifeCycle.theory.T01_BeanLifecycle.model.Product;

public interface ProductService {
    Product save(Product product);

    List<Product> findAll();
}

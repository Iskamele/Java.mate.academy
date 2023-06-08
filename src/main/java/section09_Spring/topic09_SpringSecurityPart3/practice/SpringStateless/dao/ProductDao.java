package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.dao;

import java.util.List;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.Product;

public interface ProductDao {
    Product save(Product product);

    List<Product> findAll();

    void delete(Long id);
}

package section09_Spring.topic09_SpringSecurityPart3.theory.T01_Stateless.service;

import java.util.List;
import section09_Spring.topic09_SpringSecurityPart3.theory.T01_Stateless.model.Product;

public interface ProductService {
    Product save(Product user);

    List<Product> findAll();

    Product get(Long id);

    List<Product> findByBrand(String brand);

    void delete(Long id);

    Product update(Product product);
}

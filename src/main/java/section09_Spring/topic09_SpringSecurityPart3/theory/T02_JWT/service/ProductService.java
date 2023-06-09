package section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.service;

import java.util.List;
import section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.model.Product;

public interface ProductService {
    Product save(Product user);

    List<Product> findAll();

    Product get(Long id);

    List<Product> findByBrand(String brand);

    void delete(Long id);

    Product update(Product product);
}

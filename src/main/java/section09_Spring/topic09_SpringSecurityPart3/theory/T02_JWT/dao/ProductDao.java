package section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.model.Product;

public interface ProductDao {
    Product save(Product user);

    Optional<Product> get(Long id);

    List<Product> findAll();

    List<Product> findByBrand(String brand);

    void delete(Long id);

    Product update(Product product);
}

package section09_Spring.topic07_SpringSecurityPart2.theory.T01_UserDetails.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic07_SpringSecurityPart2.theory.T01_UserDetails.model.Product;

public interface ProductDao {
    Product save(Product user);

    Optional<Product> get(Long id);

    List<Product> findAll();

    List<Product> findByBrand(String brand);

    void delete(Long id);

    Product update(Product product);
}

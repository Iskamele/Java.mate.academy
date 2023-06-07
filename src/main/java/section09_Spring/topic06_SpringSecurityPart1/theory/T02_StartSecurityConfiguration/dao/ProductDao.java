package section09_Spring.topic06_SpringSecurityPart1.theory.T02_StartSecurityConfiguration.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.model.Product;

public interface ProductDao {
    Product save(Product user);

    Optional<Product> get(Long id);

    List<Product> findAll();

    List<Product> findByBrand(String brand);

    void delete(Long id);

    Product update(Product product);
}

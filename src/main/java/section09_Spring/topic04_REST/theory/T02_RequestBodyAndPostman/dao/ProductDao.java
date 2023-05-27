package section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.model.Product;

public interface ProductDao {
    Product save(Product user);

    Optional<Product> get(Long id);

    List<Product> findAll();

    List<Product> findByBrand(String brand);
}

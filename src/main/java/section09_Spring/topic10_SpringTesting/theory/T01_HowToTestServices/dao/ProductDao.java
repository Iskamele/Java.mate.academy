package section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.model.Product;

public interface ProductDao {
    Product save(Product user);

    Optional<Product> get(Long id);

    List<Product> findAll();

    List<Product> findByBrand(String brand);

    void delete(Long id);

    Product update(Product product);
}

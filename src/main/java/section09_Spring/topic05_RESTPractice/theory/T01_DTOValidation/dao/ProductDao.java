package section09_Spring.topic05_RESTPractice.theory.T01_DTOValidation.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic05_RESTPractice.theory.T01_DTOValidation.model.Product;

public interface ProductDao {
    Product save(Product user);

    Optional<Product> get(Long id);

    List<Product> findAll();

    List<Product> findByBrand(String brand);

    void delete(Long id);

    Product update(Product product);
}

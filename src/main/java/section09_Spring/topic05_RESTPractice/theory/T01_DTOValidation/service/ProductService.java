package section09_Spring.topic05_RESTPractice.theory.T01_DTOValidation.service;

import java.util.List;
import section09_Spring.topic05_RESTPractice.theory.T01_DTOValidation.model.Product;

public interface ProductService {
    Product save(Product user);

    List<Product> findAll();

    Product get(Long id);

    List<Product> findByBrand(String brand);

    void delete(Long id);

    Product update(Product product);
}

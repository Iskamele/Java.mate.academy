package section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.service;

import java.util.List;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.model.Product;

public interface ProductService {
    Product save(Product user);

    List<Product> findAll();

    Product get(Long id);

    List<Product> findByBrand(String brand);

    void delete(Long id);

    Product update(Product product);
}

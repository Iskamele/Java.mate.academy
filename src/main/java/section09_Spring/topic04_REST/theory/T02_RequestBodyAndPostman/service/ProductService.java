package section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.service;

import java.util.List;
import section09_Spring.topic04_REST.theory.T02_RequestBodyAndPostman.model.Product;

public interface ProductService {
    Product save(Product user);

    List<Product> findAll();

    Product get(Long id);

    List<Product> findByBrand(String brand);
}

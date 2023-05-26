package section09_Spring.topic03_SpringWeb.theory.T07_HowToCreateDTO.service;

import java.util.List;
import section09_Spring.topic03_SpringWeb.theory.T07_HowToCreateDTO.model.Product;

public interface ProductService {
    Product save(Product user);

    List<Product> findAll();
}

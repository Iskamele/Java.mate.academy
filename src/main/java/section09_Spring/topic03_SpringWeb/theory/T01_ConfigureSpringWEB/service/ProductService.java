package section09_Spring.topic03_SpringWeb.theory.T01_ConfigureSpringWEB.service;

import java.util.List;
import section09_Spring.topic03_SpringWeb.theory.T01_ConfigureSpringWEB.model.Product;

public interface ProductService {
    Product save(Product user);

    List<Product> findAll();
}

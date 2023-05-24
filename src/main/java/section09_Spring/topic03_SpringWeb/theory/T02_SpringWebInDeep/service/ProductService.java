package section09_Spring.topic03_SpringWeb.theory.T02_SpringWebInDeep.service;

import java.util.List;
import section09_Spring.topic03_SpringWeb.theory.T02_SpringWebInDeep.model.Product;

public interface ProductService {
    Product save(Product user);

    List<Product> findAll();
}

package section09_Spring.topic03_SpringWeb.theory.T05_DifferenceBetweenControllerAndRestController.service;

import java.util.List;
import section09_Spring.topic03_SpringWeb.theory.T05_DifferenceBetweenControllerAndRestController.model.Product;

public interface ProductService {
    Product save(Product user);

    List<Product> findAll();
}

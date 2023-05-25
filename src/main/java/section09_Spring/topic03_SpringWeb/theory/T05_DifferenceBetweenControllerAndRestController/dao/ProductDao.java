package section09_Spring.topic03_SpringWeb.theory.T05_DifferenceBetweenControllerAndRestController.dao;

import java.util.List;
import section09_Spring.topic03_SpringWeb.theory.T05_DifferenceBetweenControllerAndRestController.model.Product;

public interface ProductDao {
    Product save(Product user);

    List<Product> findAll();
}

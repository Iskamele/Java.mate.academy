package section09_Spring.topic03_SpringWeb.theory.T01_ConfigureSpringWEB.dao;

import java.util.List;
import section09_Spring.topic03_SpringWeb.theory.T01_ConfigureSpringWEB.model.Product;

public interface ProductDao {
    Product save(Product user);

    List<Product> findAll();
}

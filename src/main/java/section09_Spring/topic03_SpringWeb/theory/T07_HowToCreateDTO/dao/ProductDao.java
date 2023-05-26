package section09_Spring.topic03_SpringWeb.theory.T07_HowToCreateDTO.dao;

import java.util.List;
import section09_Spring.topic03_SpringWeb.theory.T07_HowToCreateDTO.model.Product;

public interface ProductDao {
    Product save(Product user);

    List<Product> findAll();
}

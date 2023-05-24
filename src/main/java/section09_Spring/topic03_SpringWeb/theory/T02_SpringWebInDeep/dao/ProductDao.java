package section09_Spring.topic03_SpringWeb.theory.T02_SpringWebInDeep.dao;

import java.util.List;
import section09_Spring.topic03_SpringWeb.theory.T02_SpringWebInDeep.model.Product;

public interface ProductDao {
    Product save(Product user);

    List<Product> findAll();
}

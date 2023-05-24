package section09_Spring.topic03_SpringWeb.theory.T03_DifferenceBetweenControllerAndServlet.dao;

import java.util.List;
import section09_Spring.topic03_SpringWeb.theory.T03_DifferenceBetweenControllerAndServlet.model.Product;

public interface ProductDao {
    Product save(Product user);

    List<Product> findAll();
}

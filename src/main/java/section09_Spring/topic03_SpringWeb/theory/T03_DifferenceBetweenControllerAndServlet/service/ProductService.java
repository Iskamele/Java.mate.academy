package section09_Spring.topic03_SpringWeb.theory.T03_DifferenceBetweenControllerAndServlet.service;

import java.util.List;
import section09_Spring.topic03_SpringWeb.theory.T03_DifferenceBetweenControllerAndServlet.model.Product;

public interface ProductService {
    Product save(Product user);

    List<Product> findAll();
}

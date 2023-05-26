package section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.service;

import java.util.List;
import section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.model.Product;

public interface ProductService {
    Product save(Product user);

    List<Product> findAll();

    Product get(Long id);

    List<Product> findByBrand(String brand);
}

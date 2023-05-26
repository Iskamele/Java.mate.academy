package section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic03_SpringWeb.theory.T08_PathVariableVsRequestParamAnnotation.model.Product;

public interface ProductDao {
    Product save(Product user);

    Optional<Product> get(Long id);

    List<Product> findAll();

    List<Product> findByBrand(String brand);
}

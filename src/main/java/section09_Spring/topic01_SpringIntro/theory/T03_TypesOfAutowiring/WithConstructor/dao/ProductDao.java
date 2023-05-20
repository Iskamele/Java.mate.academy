package section09_Spring.topic01_SpringIntro.theory.T03_TypesOfAutowiring.WithConstructor.dao;

import section09_Spring.topic01_SpringIntro.theory.T03_TypesOfAutowiring.WithConstructor.model.Product;
import java.util.List;

public interface ProductDao {
    Product save(Product product);

    List<Product> findAll();
}

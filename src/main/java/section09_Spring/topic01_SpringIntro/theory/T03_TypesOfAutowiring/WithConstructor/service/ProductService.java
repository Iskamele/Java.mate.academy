package section09_Spring.topic01_SpringIntro.theory.T03_TypesOfAutowiring.WithConstructor.service;

import section09_Spring.topic01_SpringIntro.theory.T03_TypesOfAutowiring.WithConstructor.model.Product;
import java.util.List;

public interface ProductService {

    Product save(Product product);

    List<Product> findAll();
}

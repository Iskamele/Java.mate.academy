package section09_Spring.topic01_SpringIntro.theory.T03_TypesOfAutowiring.WithSetter.service;

import section09_Spring.topic01_SpringIntro.theory.T03_TypesOfAutowiring.WithSetter.model.Product;
import java.util.List;

public interface ProductService {

    Product save(Product product);

    List<Product> findAll();
}

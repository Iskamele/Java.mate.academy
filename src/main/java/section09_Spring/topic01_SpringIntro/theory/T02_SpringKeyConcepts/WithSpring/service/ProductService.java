package section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithSpring.service;

import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithSpring.model.Product;
import java.util.List;

public interface ProductService {

    Product save(Product product);

    List<Product> findAll();
}

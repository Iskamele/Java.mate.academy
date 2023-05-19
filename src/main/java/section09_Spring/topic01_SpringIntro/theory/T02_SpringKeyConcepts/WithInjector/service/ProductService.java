package section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.service;

import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.model.Product;
import java.util.List;

public interface ProductService {

    Product save(Product product);

    List<Product> findAll();
}

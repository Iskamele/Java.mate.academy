package section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.dao;

import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.model.Product;
import java.util.List;

public interface ProductDao {
    Product save(Product product);

    List<Product> findAll();
}

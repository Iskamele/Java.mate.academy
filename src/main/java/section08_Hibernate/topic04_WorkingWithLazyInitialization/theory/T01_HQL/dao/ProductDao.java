package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T01_HQL.dao;

import java.math.BigDecimal;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T01_HQL.model.Product;
import java.util.List;

public interface ProductDao {
    Product save(Product product);

    Product get(Long id);

    List<Product> findAll();

    List<Product> findAllWherePriceGreaterThan(BigDecimal price);
}

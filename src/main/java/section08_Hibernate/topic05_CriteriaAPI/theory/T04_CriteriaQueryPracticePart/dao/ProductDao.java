package section08_Hibernate.topic05_CriteriaAPI.theory.T04_CriteriaQueryPracticePart.dao;

import java.math.BigDecimal;
import java.util.List;
import section08_Hibernate.topic05_CriteriaAPI.theory.T04_CriteriaQueryPracticePart.model.Product;

public interface ProductDao {
    Product save(Product product);

    Product get(Long id);

    List<Product> findAllWherePriceBetween(BigDecimal from, BigDecimal to);

    List<Product> findAllWherePriceBetweenAndColorIn(BigDecimal from, BigDecimal to, String[] colors);

    List<Product> findAllWherePriceBetweenOrColorIn(BigDecimal from, BigDecimal to, String[] colors);
}

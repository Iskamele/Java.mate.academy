package section08_Hibernate.topic010_HibernateCacheLevels.theory.T02_FirstLevelCache.dao;

import section08_Hibernate.topic010_HibernateCacheLevels.theory.T02_FirstLevelCache.model.Product;
import java.util.List;

public interface ProductDao {
    Product save(Product product);

    Product get(Long id);
}

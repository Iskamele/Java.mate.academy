package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.model.Product;

public interface ProductDao {
    Product save(Product entity);

    Product get(Long id);
}

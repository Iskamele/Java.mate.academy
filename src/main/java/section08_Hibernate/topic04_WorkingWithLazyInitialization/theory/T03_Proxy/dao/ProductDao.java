package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T03_Proxy.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T03_Proxy.model.Product;

public interface ProductDao {
    Product save(Product entity);

    Product get(Long id);
}

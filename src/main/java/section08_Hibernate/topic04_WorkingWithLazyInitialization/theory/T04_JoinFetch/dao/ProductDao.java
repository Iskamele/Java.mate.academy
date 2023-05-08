package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T04_JoinFetch.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T04_JoinFetch.model.Product;

public interface ProductDao {
    Product save(Product entity);

    Product get(Long id);
}

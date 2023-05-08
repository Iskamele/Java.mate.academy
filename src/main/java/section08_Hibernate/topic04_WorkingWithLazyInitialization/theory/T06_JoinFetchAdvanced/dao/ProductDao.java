package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.model.Product;

public interface ProductDao {
    Product save(Product entity);

    Product get(Long id);
}

package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.model.Product;

public interface ProductDao {
    Product save(Product entity);

    Product get(Long id);
}

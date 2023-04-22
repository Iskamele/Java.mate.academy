package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T07_FetchTypeLazyInitializationException.Lazy.dao;

import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T07_FetchTypeLazyInitializationException.Lazy.model.Product;

public interface ProductDao {
    Product save(Product movie);

    Product get(Long id);
}

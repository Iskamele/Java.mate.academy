package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T05_BidirectionalManyToMany.dao;

import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T05_BidirectionalManyToMany.model.Product;

public interface ProductDao {
    Product save(Product movie);

    Product get(Long id);
}

package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T04_ManyToMany.dao;

import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T04_ManyToMany.model.Product;

public interface ProductDao {
    Product save(Product movie);

    Product get(Long id);
}

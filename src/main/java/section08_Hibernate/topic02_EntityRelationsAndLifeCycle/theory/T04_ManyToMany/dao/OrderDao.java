package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T04_ManyToMany.dao;

import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T04_ManyToMany.model.Order;

public interface OrderDao {
    Order save(Order movie);

    Order get(Long id);
}

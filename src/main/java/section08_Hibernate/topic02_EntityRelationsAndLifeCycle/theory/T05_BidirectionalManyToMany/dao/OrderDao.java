package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T05_BidirectionalManyToMany.dao;

import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T05_BidirectionalManyToMany.model.Order;

public interface OrderDao {
    Order save(Order movie);

    Order get(Long id);
}

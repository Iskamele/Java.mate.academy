package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T03_BidirectionalOneToMany.dao;

import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T03_BidirectionalOneToMany.model.Order;

public interface OrderDao {
    Order save(Order movie);

    Order get(Long id);
}

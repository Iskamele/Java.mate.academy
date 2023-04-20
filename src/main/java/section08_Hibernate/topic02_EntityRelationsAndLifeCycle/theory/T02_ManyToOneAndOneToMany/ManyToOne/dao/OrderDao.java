package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.ManyToOne.dao;

import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.ManyToOne.model.Order;

public interface OrderDao {
    Order save(Order order);

    Order get(Long id);
}

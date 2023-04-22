package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T08_EntityStatesEntityLifeCycle.dao;

import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T08_EntityStatesEntityLifeCycle.model.Order;

public interface OrderDao {
    Order save(Order movie);

    Order get(Long id);
}

package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T07_FetchTypeLazyInitializationException.Lazy.dao;

import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T07_FetchTypeLazyInitializationException.Lazy.model.Order;

public interface OrderDao {
    Order save(Order movie);

    Order get(Long id);
}

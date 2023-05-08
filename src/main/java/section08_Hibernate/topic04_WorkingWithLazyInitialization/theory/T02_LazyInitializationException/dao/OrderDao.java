package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.model.Order;

public interface OrderDao {
    Order save(Order entity);

    Order get(Long id);
}

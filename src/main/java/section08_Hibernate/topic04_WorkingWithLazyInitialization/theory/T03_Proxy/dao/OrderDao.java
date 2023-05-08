package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T03_Proxy.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T03_Proxy.model.Order;

public interface OrderDao {
    Order save(Order entity);

    Order get(Long id);
}

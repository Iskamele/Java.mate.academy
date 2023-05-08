package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.model.Order;

public interface OrderDao {
    Order save(Order entity);

    Order get(Long id);
}

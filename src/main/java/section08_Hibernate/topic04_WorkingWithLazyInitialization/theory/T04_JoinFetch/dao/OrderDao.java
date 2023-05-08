package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T04_JoinFetch.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T04_JoinFetch.model.Order;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T04_JoinFetch.model.User;
import java.util.List;

public interface OrderDao {
    Order save(Order entity);

    Order get(Long id);

    List<Order> findAll(User user);
}

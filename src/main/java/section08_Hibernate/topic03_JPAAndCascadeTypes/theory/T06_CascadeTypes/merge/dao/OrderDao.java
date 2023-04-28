package section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes.merge.dao;

import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T06_CascadeTypes.merge.model.Order;

public interface OrderDao {
    Order save(Order movie);

    Order get(Long id);

    Order remove(Order order);

    void update(Order order);
}

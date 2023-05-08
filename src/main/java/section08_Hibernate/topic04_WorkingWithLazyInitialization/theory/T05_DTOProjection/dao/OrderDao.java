package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.model.Order;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.model.dto.OrdersByUserStatisticDto;
import java.util.List;

public interface OrderDao {
    Order save(Order entity);

    Order get(Long id);

    List<OrdersByUserStatisticDto> getOrdersStatistic();
}

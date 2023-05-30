package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.mapper.impl.response;

import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.mapper.DtoResponseMapper;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.Order;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.Ticket;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.dto.response.OrderResponseDto;

@Component
public class OrderResponseMapper implements DtoResponseMapper<OrderResponseDto, Order> {
    @Override
    public OrderResponseDto toDto(Order order) {
        OrderResponseDto orderResponseDto = new OrderResponseDto();
        orderResponseDto.setId(order.getId());
        orderResponseDto.setTicketsIds(order.getTickets()
                .stream()
                .map(Ticket::getId)
                .collect(Collectors.toList()));
        orderResponseDto.setOrderDate(order.getOrderDate());
        orderResponseDto.setUserId(order.getUser().getId());
        return orderResponseDto;
    }
}

package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.mapper;

import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dto.response.ShoppingCartResponseDto;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.ShoppingCart;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.Ticket;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartMapper implements
        ResponseDtoMapper<ShoppingCartResponseDto, ShoppingCart> {

    @Override
    public ShoppingCartResponseDto mapToDto(ShoppingCart shoppingCart) {
        ShoppingCartResponseDto responseDto = new ShoppingCartResponseDto();
        responseDto.setUserId(shoppingCart.getUser().getId());
        responseDto.setTicketIds(shoppingCart.getTickets()
                .stream()
                .map(Ticket::getId)
                .toList());
        return responseDto;
    }
}

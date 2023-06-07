package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dto.response;

import java.util.List;

public class ShoppingCartResponseDto {
    private Long userId;
    private List<Long> ticketIds;

    public List<Long> getTicketIds() {
        return ticketIds;
    }

    public void setTicketIds(List<Long> ticketIds) {
        this.ticketIds = ticketIds;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}

package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T05_DTOProjection.model.dto;

public class OrdersByUserStatisticDto {
    private String userName;
    private long countOfOrders;

    public OrdersByUserStatisticDto(String userName, long countOfOrders) {
        this.userName = userName;
        this.countOfOrders = countOfOrders;
    }

    @Override
    public String toString() {
        return "OrdersByUserStatisticDto{" +
                "userName='" + userName + '\'' +
                ", countOfOrders=" + countOfOrders +
                '}';
    }
}

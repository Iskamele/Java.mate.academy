package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T03_BidirectionalOneToMany.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private LocalDateTime orderDate;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User owner;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Id=" + Id +
                ", orderDate=" + orderDate +
                ", owner=" + owner +
                '}';
    }
}

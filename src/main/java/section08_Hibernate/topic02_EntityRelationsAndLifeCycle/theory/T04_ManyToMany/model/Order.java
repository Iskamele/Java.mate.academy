package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T04_ManyToMany.model;

import java.time.LocalDateTime;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private LocalDateTime orderDate;

    @ManyToOne
    private User owner;

    @ManyToMany
    @JoinTable(name = "orders_procuts",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products;

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

    public List<Product> getProductList() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Id=" + Id +
                ", orderDate=" + orderDate +
                ", owner=" + owner +
                ", products=" + products +
                '}';
    }
}

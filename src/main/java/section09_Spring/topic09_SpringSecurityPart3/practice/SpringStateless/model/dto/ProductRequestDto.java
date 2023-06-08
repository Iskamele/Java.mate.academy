package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.dto;

import java.math.BigDecimal;

public class ProductRequestDto {
    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

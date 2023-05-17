package section08_Hibernate.topic09_HibernateInheritance.theory.T01_InheritanceStrategiesOverview.JoinedTable.model;

import java.math.BigDecimal;
import javax.persistence.Entity;

@Entity(name = "racing_car")
public class RacingCar extends Machine {
    private double maxSpeed;

    public RacingCar() {
    }

    public RacingCar(String name, BigDecimal price, double maxSpeed) {
        super(name, price);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

package section08_Hibernate.topic09_HibernateInheritance.theory.T01_InheritanceStrategiesOverview.JoinedTable.model;

import java.math.BigDecimal;
import javax.persistence.Entity;

@Entity(name = "electric_car")
public class ElectricCar extends Machine {
    public double chargeLevel;

    public ElectricCar() {
    }

    public ElectricCar(String name, BigDecimal price, double chargeLevel) {
        super(name, price);
        this.chargeLevel = chargeLevel;
    }

    public double getChargeLevel() {
        return chargeLevel;
    }

    public void setChargeLevel(double chargeLevel) {
        this.chargeLevel = chargeLevel;
    }
}

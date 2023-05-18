package section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.figure;

import javax.persistence.Entity;

@Entity(name = "Triangle")
public class Triangle extends Figure {
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}

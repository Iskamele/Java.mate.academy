package section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.figure;

import javax.persistence.Entity;

@Entity(name = "Circle")
public class Circle extends Figure {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

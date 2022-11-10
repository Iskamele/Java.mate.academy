package section04_JavaCore.topic05_AbstractClassVsInterface.practice.OOPAdvanced;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle"
                + ", area: " + getArea() + " sq.units"
                + ", radius: " + this.radius
                + ", color: " + getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return (Math.PI * this.radius * this.radius);
    }
}


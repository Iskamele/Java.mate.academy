package section04_JavaCore.topic05_AbstractClassVsInterface.practice.OOPAdvanced;

public class Rectangle extends Figure {
    private final int width;
    private final int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle"
                + ", area: " + getArea() + " sq.units"
                + ", width: " + this.width
                + ", height: " + this.height
                + ", color: " + getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}

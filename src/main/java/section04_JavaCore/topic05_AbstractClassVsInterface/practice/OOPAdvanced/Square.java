package section04_JavaCore.topic05_AbstractClassVsInterface.practice.OOPAdvanced;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square"
                + ", area: " + getArea() + " sq.units"
                + ", side: " + this.side
                + ", color: " + getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}

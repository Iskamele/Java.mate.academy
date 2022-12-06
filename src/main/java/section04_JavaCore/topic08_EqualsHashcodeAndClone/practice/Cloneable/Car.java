package section04_JavaCore.topic08_EqualsHashcodeAndClone.practice.Cloneable;

public class Car implements Cloneable {
    private int year;
    private String model;
    private String automobileClass;
    private String color;
    private int cost;
    private Engine engine;

    public Car() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAutomobileClass() {
        return automobileClass;
    }

    public void setAutomobileClass(String automobileClass) {
        this.automobileClass = automobileClass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car {"
                + "year = " + year + " | "
                + "model = " + model + " | "
                + "automobile class = " + automobileClass + " | "
                + "color = " + color + " | "
                + "cost = " + cost + " | "
                + "engine = " + engine + " | "
                +"}";
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone ", e);
        }
    }
}

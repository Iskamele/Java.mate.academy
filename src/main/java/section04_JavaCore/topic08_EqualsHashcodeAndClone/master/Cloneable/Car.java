package section04_JavaCore.topic08_EqualsHashcodeAndClone.master.Cloneable;

public class Car implements Cloneable {
    private int year;
    private String model;
    private String automobileClass;
    private String color;
    private int cost;
    private Engine engine;

    public Car() {
    }

    public Car(int year, String model, String automobileClass, String color, int cost, Engine engine) {
        this.year = year;
        this.model = model;
        this.automobileClass = automobileClass;
        this.color = color;
        this.cost = cost;
        this.engine = engine;
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
    protected Car clone() throws CloneNotSupportedException {
        return new Car(year, model, automobileClass, color, cost, engine.clone());
    }
}

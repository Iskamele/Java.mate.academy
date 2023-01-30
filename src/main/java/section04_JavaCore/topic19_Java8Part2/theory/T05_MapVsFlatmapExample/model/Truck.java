package section04_JavaCore.topic19_Java8Part2.theory.T05_MapVsFlatmapExample.model;

import java.util.List;

public class Truck {
    private String model;
    private Engine engine;
    private List<Wheel> wheels;

    public Truck(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}

package section04_JavaCore.topic13_PECS.theory.T04_PECSConsumerSuper.model;

public class CargoPlane extends Plane {
    private double maxWeight;

    public CargoPlane() {
    }

    public CargoPlane(String marker, String model) {
        super(marker, model);
    }

    public CargoPlane(String marker, String model, int year) {
        super(marker, model, year);
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }
}

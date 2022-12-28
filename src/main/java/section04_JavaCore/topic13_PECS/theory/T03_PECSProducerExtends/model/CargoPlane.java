package section04_JavaCore.topic13_PECS.theory.T03_PECSProducerExtends.model;

public class CargoPlane extends Plane {
    private double maxWeight;

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

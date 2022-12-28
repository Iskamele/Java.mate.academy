package section04_JavaCore.topic13_PECS.theory.T03_PECSProducerExtends.model;

public class PassengerPlane extends Plane {
    private int capacity;

    public PassengerPlane(String marker, String model, int year) {
        super(marker, model, year);
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

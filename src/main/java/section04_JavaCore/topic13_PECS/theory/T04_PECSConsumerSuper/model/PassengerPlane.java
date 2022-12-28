package section04_JavaCore.topic13_PECS.theory.T04_PECSConsumerSuper.model;

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

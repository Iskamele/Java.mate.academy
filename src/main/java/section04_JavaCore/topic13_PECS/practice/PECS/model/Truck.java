package section04_JavaCore.topic13_PECS.practice.PECS.model;

public class Truck extends Machine {
    private boolean elevatorMechanism;
    private int carryingCapacity;

    public Truck() {
    }

    public Truck(String model, String color) {
        super(model, color);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}

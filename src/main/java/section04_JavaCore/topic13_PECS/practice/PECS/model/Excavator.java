package section04_JavaCore.topic13_PECS.practice.PECS.model;

public class Excavator extends Machine {
    private int bucketCapacity;
    private int machineWeight;

    public Excavator() {
    }

    public Excavator(String model, String color) {
        super(model, color);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}

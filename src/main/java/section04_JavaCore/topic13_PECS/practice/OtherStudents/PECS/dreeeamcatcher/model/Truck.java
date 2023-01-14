package section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.dreeeamcatcher.model;

public class Truck extends Machine {
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

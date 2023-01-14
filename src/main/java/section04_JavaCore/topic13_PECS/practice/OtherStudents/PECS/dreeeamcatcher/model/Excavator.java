package section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.dreeeamcatcher.model;

public class Excavator extends Machine {
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

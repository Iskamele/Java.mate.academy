package section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.dreeeamcatcher.model;

public class Bulldozer extends Machine {
    public Bulldozer() {
    }

    public Bulldozer(String model, String color) {
        super(model, color);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}

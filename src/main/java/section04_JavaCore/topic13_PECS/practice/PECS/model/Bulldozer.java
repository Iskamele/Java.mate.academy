package section04_JavaCore.topic13_PECS.practice.PECS.model;

public class Bulldozer extends Machine {
    private int bladeLength;
    private int bladeWidth;
    private boolean swivelPushFrame;

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

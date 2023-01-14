package section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.katrevichdv.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeWidth;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bladeWidth) {
        super(name, color);
        this.bladeWidth = bladeWidth;
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
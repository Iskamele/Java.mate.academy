package section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.katrevichdv.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int loadCapacity;

    public Truck() {
    }

    public Truck(String name, String color, int loadCapacity) {
        super(name, color);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
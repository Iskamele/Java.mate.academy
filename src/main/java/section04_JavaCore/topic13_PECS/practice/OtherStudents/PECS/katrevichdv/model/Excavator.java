package section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.katrevichdv.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketSize;

    public Excavator() {
    }

    public Excavator(String name, String color, int bucketSize) {
        super(name, color);
        this.bucketSize = bucketSize;
    }

    public int getBucketSize() {
        return bucketSize;
    }

    public void setBucketSize(int bucketSize) {
        this.bucketSize = bucketSize;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
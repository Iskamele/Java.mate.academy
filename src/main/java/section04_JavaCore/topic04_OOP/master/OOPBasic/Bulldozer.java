package section04_JavaCore.topic04_OOP.master.OOPBasic;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer start working!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped working!");
    }
}

package section02_JavaBasicsExtended.topic06_ClassesAdvanced.ObjectSuperclass;

public class ObjectMain {
    public static void main(String[] args) {
        // The Object class is the parent of all classes in Java

        Car car = new Car();
        Machine machine = new Machine();
        Machine machineCar = new Car();
        Object carObject = new Car();
        Object machineObject = new Machine();

        Object stringObject = new String();

        car.toString();
    }
}

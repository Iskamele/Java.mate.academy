package section02_JavaBasicsExtended.topic06_ClassesAdvanced.ConstructorOverloading;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(2018, "green");

        Car car1 = new Car();
        car1.year = 2020;
        car1.color = "red";

        Car car2 = new Car(1996);
    }
}

package section02_JavaBasicsExtended.topic06_ClassesAdvanced.ConstructorOverloading;

public class Car {
    int year;
    String color;

    // constructor overloading
    public Car(int year, String color){
        this.year = year;
        this.color = color;
    }

    public Car(){

    }

    public Car (int year){
        this.year = year;
    }
}

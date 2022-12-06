package section04_JavaCore.topic08_EqualsHashcodeAndClone.practice.Cloneable;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setEnginePower(100);
        engine.setCost(50000);
        engine.setFuelConsumption(1.4);
        engine.setTorque(1);

        Car car = new Car();
        car.setYear(2018);
        car.setModel("Audi");
        car.setAutomobileClass("Sedan");
        car.setColor("Blue");
        car.setCost(300000);
        car.setEngine(engine);

        System.out.println(car);

        Car clonedCar = car.clone();
        car.getEngine().setEnginePower(200);
        System.out.println(car);
        System.out.println(clonedCar);
    }
}

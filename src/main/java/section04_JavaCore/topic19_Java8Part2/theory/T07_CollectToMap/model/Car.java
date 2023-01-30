package section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.model;

public class Car {
    private String maker;
    private String model;
    private int year;

    public Car(String maker, String model, int year) {
        this.maker = maker;
        this.model = model;
        this.year = year;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

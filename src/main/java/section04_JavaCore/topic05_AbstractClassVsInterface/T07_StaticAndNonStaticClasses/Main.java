package section04_JavaCore.topic05_AbstractClassVsInterface.T07_StaticAndNonStaticClasses;

public class Main {
    public static void main(String[] args) {
        // static class

        Car.Builder builder = new Car.Builder();
        Car.Inner inner = new Car().new Inner();
    }
}

package section04_JavaCore.topic05_AbstractClassVsInterface.theory.T03_DifferenceBetweenAbstractClassesAndInterfaces;

public interface Flyable {
    // public static final
    String name = "Bob";

    // After Java 8
    // public
    default void sayHello() {
        System.out.println("Hello");
        hired();
    }

    private void hired(){

    }
}

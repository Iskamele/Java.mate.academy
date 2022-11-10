package section04_JavaCore.topic05_AbstractClassVsInterface.theory.T01_PracticeUsage.model;

public class Sparrow extends Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}

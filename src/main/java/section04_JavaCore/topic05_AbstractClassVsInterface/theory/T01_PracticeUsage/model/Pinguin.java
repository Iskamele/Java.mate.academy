package section04_JavaCore.topic05_AbstractClassVsInterface.theory.T01_PracticeUsage.model;

public class Pinguin extends Bird implements Swimmable{

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}

package section04_JavaCore.topic05_AbstractClassVsInterface.theory.T01_PracticeUsage.model;

public class Fish extends Animal implements Swimmable {
    private String country;

    @Override
    public void eat(Food food) {
        System.out.println("Fish accepted food");
    }

    // fish can swim
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }

    // specific food
}

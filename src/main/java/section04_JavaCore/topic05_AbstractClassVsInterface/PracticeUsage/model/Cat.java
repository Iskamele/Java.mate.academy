package section04_JavaCore.topic05_AbstractClassVsInterface.PracticeUsage.model;

public class Cat extends Animal{
    private String ownerName;

    @Override
    public void eat(Food food) {
        System.out.println("Cat accepted food");
    }

    // specific food
}

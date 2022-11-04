package section04_JavaCore.topic05_AbstractClassVsInterface.PracticeUsage.model;

public abstract class Animal {
    private String name;
    private boolean isHungry;

    // every animal can eat
    public abstract void eat(Food food);
}

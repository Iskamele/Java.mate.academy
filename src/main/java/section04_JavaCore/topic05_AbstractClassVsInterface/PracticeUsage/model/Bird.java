package section04_JavaCore.topic05_AbstractClassVsInterface.PracticeUsage.model;

public class Bird extends Animal{
    private String featherColor;

    @Override
    public void eat(Food food) {
        System.out.println("Bird accepted food");
    }

    // bird can fly

}

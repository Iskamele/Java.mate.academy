package section04_JavaCore.topic10_Generics.theory.T03_InheritancePractice.model;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void acceptFood(String food);
}

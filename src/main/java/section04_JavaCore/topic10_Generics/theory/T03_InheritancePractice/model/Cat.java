package section04_JavaCore.topic10_Generics.theory.T03_InheritancePractice.model;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void acceptFood(String food) {
        System.out.println("Cat os eating " + food);
    }
}

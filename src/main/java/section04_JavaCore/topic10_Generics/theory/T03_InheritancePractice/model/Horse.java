package section04_JavaCore.topic10_Generics.theory.T03_InheritancePractice.model;

public class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    @Override
    public void acceptFood(String food) {
        System.out.println("Horse is eating " + food);
    }

    public boolean hasHorseshoes() {
        return true;
    }
}

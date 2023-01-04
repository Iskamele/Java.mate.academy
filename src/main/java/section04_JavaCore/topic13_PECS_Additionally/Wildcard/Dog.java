package section04_JavaCore.topic13_PECS_Additionally.Wildcard;

public class Dog extends Animal {
    public Dog(int id) {
        super(id);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }
}

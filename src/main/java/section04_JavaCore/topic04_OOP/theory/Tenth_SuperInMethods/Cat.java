package section04_JavaCore.topic04_OOP.theory.Tenth_SuperInMethods;

public class Cat extends Animal {
    private String color;

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, String color){
        super(name, age);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name = " + getName() + ", " +
                "age = " + getAge() + ", " +
                "color = " + color +
                '}';
    }

    @Override
    public String getInfo() {
        String superInfo = super.getInfo();
        return superInfo + ", color: " + color;
    }
}

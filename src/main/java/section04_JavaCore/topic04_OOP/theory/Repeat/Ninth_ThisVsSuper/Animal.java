package section04_JavaCore.topic04_OOP.theory.Repeat.Ninth_ThisVsSuper;

public class Animal {
    private String name;
    private int age;
    private int weight;

    public Animal(String name, int age, int weigth) {
        this.name = name;
        this.age = age;
        this.weight = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

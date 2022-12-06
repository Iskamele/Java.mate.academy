package section04_JavaCore.topic09_PatternsAndRecurstion.theory.T03_StaticFabricMethod;

public class User {
    String name;
    int age;

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

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static User of(String name, int age) {
        return new User(name, age);
    }

    @Override
    public String toString() {
        return "User {"
                + "name: " + name
                +", age: " + age
                + '}';
    }
}

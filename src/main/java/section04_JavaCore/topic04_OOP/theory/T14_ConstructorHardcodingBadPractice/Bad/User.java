package section04_JavaCore.topic04_OOP.theory.T14_ConstructorHardcodingBadPractice.Bad;

public class User {
    private int age;
    private String name;

    public User() {
        age = 22;
        name = "Bob";
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

package section04_JavaCore.topic04_OOP.practice.Third_InheritanceSecondPart;

public class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalInfo() {
        return "age: " + age + ", name: " + name;
    }
}

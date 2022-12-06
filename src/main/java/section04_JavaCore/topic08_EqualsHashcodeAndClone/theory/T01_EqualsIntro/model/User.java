package section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T01_EqualsIntro.model;

public class User {
    private String name;
    private int age;
    private String inn;

    public User(String name, int age, String inn) {
        this.name = name;
        this.age = age;
        this.inn = inn;
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

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    // Реализация этого метода будет в T02
    @Override
    public boolean equals(Object user) {
        return true;
    }
}

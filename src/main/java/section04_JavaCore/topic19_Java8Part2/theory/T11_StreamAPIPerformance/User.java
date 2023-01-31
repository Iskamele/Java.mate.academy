package section04_JavaCore.topic19_Java8Part2.theory.T11_StreamAPIPerformance;

public class User {
    private int height;
    private int age;
    private boolean hasCat;

    public User(int height, int age, boolean hasCat) {
        this.height = height;
        this.age = age;
        this.hasCat = hasCat;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public boolean hasCat() {
        return hasCat;
    }

    @Override
    public String toString() {
        return "User{" +
                "height=" + height +
                ", age=" + age +
                ", hasCat=" + hasCat +
                '}';
    }
}

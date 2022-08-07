package section02_JavaBasicsExtended.topic06_ClassesAdvanced.theory.GettersAndSetters.user;

public class AdultUser {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("Age is less than expected");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

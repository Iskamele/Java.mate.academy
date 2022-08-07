package section02_JavaBasicsExtended.topic06_ClassesAdvanced.theory.GettersAndSetters.user;

public class UserMain {
    public static void main(String[] args) {
        AdultUser user = new AdultUser();

        user.setAge(19);

        int age = user.getAge();
    }
}

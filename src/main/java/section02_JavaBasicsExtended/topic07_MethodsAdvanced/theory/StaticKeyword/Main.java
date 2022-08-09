package section02_JavaBasicsExtended.topic07_MethodsAdvanced.theory.StaticKeyword;

public class Main {
    public static void main(String[] args) {
        // static keyword
        // - variables
        // - methods

        User user = new User();
        System.out.println(user.age);
        user.age = 18;
        System.out.println(user.age);

        User user2 = new User();
        System.out.println(user2.age);


    }
}

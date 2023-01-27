package section04_JavaCore.topic19_Java8Part1.theory.T08_MethodReference;

public class TestMain {

    public static void main(String[] args) {
        Test test = new Test() {
            @Override
            public void print(String value) {
                System.out.println(value);
            }
        };

        Test test2 = System.out::println;
        test2.print("Hello");

        UserService userService = user -> user.getName();
        UserService userService2 = User::getName;

        UserService userService3 = user -> {
            if (user == null) {
                return null;
            }
            return user.getName();
        };

        User bob  = new User("Bob", 23);
        System.out.println(userService2.doAction(bob));
    }
}

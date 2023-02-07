package section04_JavaCore.topic19_Java8Part3.theory.T01_Optional.Wrapper;

import section04_JavaCore.topic19_Java8Part3.theory.T01_Optional.Optional.User;

public class Main {

    public static void main(String[] args) {
        // Java 8: Optional
        //User[] users = new User[0];
        //Wrapper<User> userWrapper = getElementByIndex(users, 10);

        User[] users = new User[]{new User("Bob")};
        Wrapper<User> userWrapper = getElementByIndex(users, 0);
        userWrapper.ifPresent(System.out::println);
    }

    private static Wrapper<User> getElementByIndex(User[] values, int index) {
        if (index >= values.length || index < 0) {
            return Wrapper.empty();
        }
        return new Wrapper<>(values[index]);
    }
}

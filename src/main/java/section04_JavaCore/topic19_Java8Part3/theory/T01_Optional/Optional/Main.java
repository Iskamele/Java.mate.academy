package section04_JavaCore.topic19_Java8Part3.theory.T01_Optional.Optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        // Java 8: Optional
        //User[] users = new User[0];
        //Wrapper<User> userWrapper = getElementByIndex(users, 10);

        User[] users = new User[]{new User("Bob")};
        Optional<User> user = getElementByIndex(users, 10);
        user.ifPresent(System.out::println);
    }

    private static Optional<User> getElementByIndex(User[] values, int index) {
        if (index >= values.length || index < 0) {
            return Optional.empty();
        }
        return Optional.of(values[index]);
    }
}

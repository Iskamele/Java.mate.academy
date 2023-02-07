package section04_JavaCore.topic19_Java8Part3.theory.T03_HowToUseOptional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        // Java 8: Optional in use
        // - ifPresent
        // - orElse
        // - orElseGet
        // - orElseThrow

        // ifPresent
        DataBase dataBase = new DataBase();
        Optional<User> userOptional = dataBase.getById(10L);
        userOptional.ifPresent(System.out::println);

        // orElse
        Optional<User> byId11 = dataBase.getById(11L);
        User alice = byId11.orElse(new User("Alice")); // Сюда нельзя передать null
        System.out.println(alice);

        // orElseGet
        Optional<User> optional = dataBase.getById(11L);
        optional.orElseGet(Main::getDefaultUser);

        // orElseThrow
        Optional<User> optionalUser = dataBase.getById(11L);
        optionalUser.orElseThrow(() -> new RuntimeException("Can't find user"));
    }

    private static User getDefaultUser() {
        return new User("Bill");
    }
}

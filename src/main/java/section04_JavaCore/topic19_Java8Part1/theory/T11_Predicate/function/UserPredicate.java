package section04_JavaCore.topic19_Java8Part1.theory.T11_Predicate.function;

import java.util.function.Predicate;

public class UserPredicate implements Predicate<User> {
    @Override
    public boolean test(User user) {
        return user.getAge() >= 18
                && user.getName().startsWith("B");
    }
}

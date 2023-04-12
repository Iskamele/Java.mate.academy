package section07_JavaWeb.topic03_WebPractice.theory.T09_DeleteUserFromDB.dao;

import java.util.ArrayList;
import java.util.List;
import section07_JavaWeb.topic03_WebPractice.theory.T09_DeleteUserFromDB.model.User;

public class UserDaoImpl implements UserDao {
    private final static List<User> users = new ArrayList<>();
    static {
        User bob = new User(1L, "Bob", 23);
        User alice = new User(2L, "Alice", 22);
        User john = new User(3L, "Johm", 27);
        users.add(bob);
        users.add(alice);
        users.add(john);
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void delete(Long id) {
        users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .ifPresent(users::remove);
    }
}

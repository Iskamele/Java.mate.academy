package section07_JavaWeb.topic03_WebPractice.theory.T03_JSPDisplayAListOfObjects.dao;

import java.util.List;
import section07_JavaWeb.topic03_WebPractice.theory.T03_JSPDisplayAListOfObjects.model.User;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> getAll() {
        User bob = new User(1L, "Bob", 23);
        User alice = new User(2L, "Alice", 22);
        User john = new User(3L, "John", 27);
        return List.of(bob, alice, john);
    }
}

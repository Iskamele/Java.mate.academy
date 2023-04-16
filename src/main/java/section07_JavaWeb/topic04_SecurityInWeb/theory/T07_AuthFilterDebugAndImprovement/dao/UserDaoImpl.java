package section07_JavaWeb.topic04_SecurityInWeb.theory.T07_AuthFilterDebugAndImprovement.dao;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T07_AuthFilterDebugAndImprovement.model.User;

public class UserDaoImpl implements UserDao {
    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.of(new User(1L, username, "1234"));
    }
}

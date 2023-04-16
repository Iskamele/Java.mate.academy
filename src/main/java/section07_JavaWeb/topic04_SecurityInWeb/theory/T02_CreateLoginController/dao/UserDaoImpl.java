package section07_JavaWeb.topic04_SecurityInWeb.theory.T02_CreateLoginController.dao;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T02_CreateLoginController.model.User;

public class UserDaoImpl implements UserDao {
    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.of(new User(username, "1234"));
    }
}

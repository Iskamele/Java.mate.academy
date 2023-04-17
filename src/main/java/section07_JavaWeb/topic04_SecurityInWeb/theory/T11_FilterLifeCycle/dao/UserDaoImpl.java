package section07_JavaWeb.topic04_SecurityInWeb.theory.T11_FilterLifeCycle.dao;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T11_FilterLifeCycle.model.User;

public class UserDaoImpl implements UserDao {
    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.of(new User(1L, username, "1234"));
    }
}

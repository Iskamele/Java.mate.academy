package section07_JavaWeb.topic04_SecurityInWeb.theory.T11_FilterLifeCycle.dao;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T11_FilterLifeCycle.model.User;

public interface UserDao {
    Optional<User> findByUsername(String username);
}

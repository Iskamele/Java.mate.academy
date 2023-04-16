package section07_JavaWeb.topic04_SecurityInWeb.theory.T02_CreateLoginController.dao;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T02_CreateLoginController.model.User;

public interface UserDao {
    Optional<User> findByUsername(String username);
}

package section07_JavaWeb.topic04_SecurityInWeb.theory.T06_AuthFilterImplementation.dao;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T06_AuthFilterImplementation.model.User;

public interface UserDao {
    Optional<User> findByUsername(String username);
}

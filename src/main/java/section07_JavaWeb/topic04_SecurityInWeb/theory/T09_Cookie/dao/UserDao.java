package section07_JavaWeb.topic04_SecurityInWeb.theory.T09_Cookie.dao;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T09_Cookie.model.User;

public interface UserDao {
    Optional<User> findByUsername(String username);
}

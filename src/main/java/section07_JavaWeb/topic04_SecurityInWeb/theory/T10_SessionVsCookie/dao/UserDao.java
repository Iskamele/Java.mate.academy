package section07_JavaWeb.topic04_SecurityInWeb.theory.T10_SessionVsCookie.dao;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T10_SessionVsCookie.model.User;

public interface UserDao {
    Optional<User> findByUsername(String username);
}

package section07_JavaWeb.topic04_SecurityInWeb.theory.T12_LogoutExample.dao;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T12_LogoutExample.model.User;

public interface UserDao {
    Optional<User> findByUsername(String username);
}

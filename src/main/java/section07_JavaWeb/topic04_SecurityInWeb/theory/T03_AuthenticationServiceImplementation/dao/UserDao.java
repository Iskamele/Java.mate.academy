package section07_JavaWeb.topic04_SecurityInWeb.theory.T03_AuthenticationServiceImplementation.dao;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T03_AuthenticationServiceImplementation.model.User;

public interface UserDao {
    Optional<User> findByUsername(String username);
}

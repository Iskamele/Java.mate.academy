package section07_JavaWeb.topic04_SecurityInWeb.theory.T07_AuthFilterDebugAndImprovement.dao;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T07_AuthFilterDebugAndImprovement.model.User;

public interface UserDao {
    Optional<User> findByUsername(String username);
}

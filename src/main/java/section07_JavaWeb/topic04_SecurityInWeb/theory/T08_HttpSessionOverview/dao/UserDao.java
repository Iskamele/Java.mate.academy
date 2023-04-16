package section07_JavaWeb.topic04_SecurityInWeb.theory.T08_HttpSessionOverview.dao;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T08_HttpSessionOverview.model.User;

public interface UserDao {
    Optional<User> findByUsername(String username);
}

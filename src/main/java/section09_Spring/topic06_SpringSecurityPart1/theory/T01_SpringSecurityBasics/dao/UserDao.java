package section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.dao;

import java.util.Optional;
import section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.model.User;

public interface UserDao {
    Optional<User> findByLogin(String login);

    Optional<User> get(Long id);
}

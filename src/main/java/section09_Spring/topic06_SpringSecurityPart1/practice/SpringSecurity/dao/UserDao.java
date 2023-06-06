package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dao;

import java.util.Optional;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.User;

public interface UserDao {
    User add(User user);

    Optional<User> get(Long id);

    Optional<User> findByEmail(String email);
}

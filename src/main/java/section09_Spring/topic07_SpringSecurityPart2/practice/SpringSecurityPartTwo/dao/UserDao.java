package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao;

import java.util.Optional;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.User;

public interface UserDao {
    User add(User user);

    Optional<User> get(Long id);

    Optional<User> findByEmail(String email);
}

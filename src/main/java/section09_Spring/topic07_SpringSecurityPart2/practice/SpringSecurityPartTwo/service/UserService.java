package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.service;

import java.util.Optional;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.User;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}

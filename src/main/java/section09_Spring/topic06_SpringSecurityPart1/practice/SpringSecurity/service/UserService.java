package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service;

import java.util.Optional;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.User;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}

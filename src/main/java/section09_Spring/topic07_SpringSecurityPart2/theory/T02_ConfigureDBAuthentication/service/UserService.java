package section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.service;

import java.util.Optional;
import section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.model.User;

public interface UserService {
    Optional<User> findByEmail(String email);
}

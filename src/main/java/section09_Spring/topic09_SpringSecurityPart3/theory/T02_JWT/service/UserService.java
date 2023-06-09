package section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.service;

import java.util.Optional;
import section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.model.User;

public interface UserService {
    Optional<User> findByEmail(String email);

    User save(User user);
}

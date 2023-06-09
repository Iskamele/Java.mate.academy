package section09_Spring.topic09_SpringSecurityPart3.theory.T01_Stateless.service;

import java.util.Optional;
import section09_Spring.topic09_SpringSecurityPart3.theory.T01_Stateless.model.User;

public interface UserService {
    Optional<User> findByEmail(String email);

    User save(User user);
}

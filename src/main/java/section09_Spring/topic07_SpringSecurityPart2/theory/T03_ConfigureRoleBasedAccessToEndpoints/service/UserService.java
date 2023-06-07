package section09_Spring.topic07_SpringSecurityPart2.theory.T03_ConfigureRoleBasedAccessToEndpoints.service;

import java.util.Optional;
import section09_Spring.topic07_SpringSecurityPart2.theory.T03_ConfigureRoleBasedAccessToEndpoints.model.User;

public interface UserService {
    Optional<User> findByEmail(String email);

    User save(User user);
}

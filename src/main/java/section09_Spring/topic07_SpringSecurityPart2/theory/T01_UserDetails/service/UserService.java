package section09_Spring.topic07_SpringSecurityPart2.theory.T01_UserDetails.service;

import java.util.Optional;
import section09_Spring.topic07_SpringSecurityPart2.theory.T01_UserDetails.model.User;

//TODO
public interface UserService {
    Optional<User> findByEmail(String email);
}

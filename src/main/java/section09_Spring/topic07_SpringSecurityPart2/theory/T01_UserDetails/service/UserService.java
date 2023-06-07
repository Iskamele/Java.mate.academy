package section09_Spring.topic07_SpringSecurityPart2.theory.T01_UserDetails.service;

import java.util.Optional;
import section09_Spring.topic06_SpringSecurityPart1.theory.T05_ObtainInformationAboutCurrentUser.model.User;

//TODO
public interface UserService {
    Optional<User> findByEmail(String email);
}

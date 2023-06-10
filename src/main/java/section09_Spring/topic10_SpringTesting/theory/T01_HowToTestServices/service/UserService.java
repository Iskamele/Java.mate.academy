package section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.service;

import java.util.Optional;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.model.User;

public interface UserService {
    Optional<User> findByEmail(String email);

    User save(User user);
}

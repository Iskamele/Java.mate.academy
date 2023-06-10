package section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.service;

import java.util.Optional;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.model.User;

public interface UserService {
    Optional<User> findByEmail(String email);

    User save(User user);
}

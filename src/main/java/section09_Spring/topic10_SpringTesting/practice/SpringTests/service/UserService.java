package section09_Spring.topic10_SpringTesting.practice.SpringTests.service;

import java.util.Optional;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.model.User;

public interface UserService {
    User save(User user);

    Optional<User> findById(Long id);

    Optional<User> findByEmail(String email);
}

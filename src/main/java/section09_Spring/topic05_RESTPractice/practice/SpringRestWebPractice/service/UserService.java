package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.service;

import java.util.Optional;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.User;

public interface UserService {
    User add(User user);

    Optional<User> findByEmail(String email);

    User get(Long id);
}

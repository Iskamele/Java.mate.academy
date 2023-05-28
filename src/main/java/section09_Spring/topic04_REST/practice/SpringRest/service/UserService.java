package section09_Spring.topic04_REST.practice.SpringRest.service;

import java.util.Optional;
import section09_Spring.topic04_REST.practice.SpringRest.model.User;

public interface UserService {
    User add(User user);

    Optional<User> findByEmail(String email);
}

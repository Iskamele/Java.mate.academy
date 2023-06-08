package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.User;

public interface UserService {
    User save(User user);

    User findById(Long id);

    Optional<User> findByEmail(String email);

    void delete(Long id);

    List<User> findAll();
}

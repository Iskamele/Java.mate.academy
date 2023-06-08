package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.User;

public interface UserDao {
    User save(User user);

    Optional<User> findByEmail(String email);

    Optional<User> findById(Long id);

    void delete(Long id);

    List<User> findAll();
}

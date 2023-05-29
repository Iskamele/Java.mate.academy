package section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.model.User;

public interface UserDao {
    User save(User user);

    Optional<User> get(Long id);

    List<User> findAll();

    void delete(Long id);
}

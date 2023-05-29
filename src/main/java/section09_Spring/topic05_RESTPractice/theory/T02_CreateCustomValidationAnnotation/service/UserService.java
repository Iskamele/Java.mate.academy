package section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.service;

import java.util.List;
import section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.model.User;

public interface UserService {
    User save(User user);

    List<User> findAll();

    User get(Long id);

    void delete(Long id);
}

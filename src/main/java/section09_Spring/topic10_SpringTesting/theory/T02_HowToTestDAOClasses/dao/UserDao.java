package section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.dao;

import java.util.Optional;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.model.User;

public interface UserDao {
    User save(User user);

    Optional<User> findByEmail(String email);

    Optional<User> findById(Long id);
}

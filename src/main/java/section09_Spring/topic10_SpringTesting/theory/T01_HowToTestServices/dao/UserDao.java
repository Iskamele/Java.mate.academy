package section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic10_SpringTesting.theory.T01_HowToTestServices.model.User;

public interface UserDao {
    User save(User user);

    Optional<User> get(Long id);

    List<User> findAll();

    void delete(Long id);

    User update(User user);
}

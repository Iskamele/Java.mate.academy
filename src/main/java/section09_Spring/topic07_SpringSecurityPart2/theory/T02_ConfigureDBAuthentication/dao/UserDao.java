package section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.model.User;

public interface UserDao {
    User save(User user);

    Optional<User> get(Long id);

    List<User> findAll();

    void delete(Long id);

    User update(User user);
}

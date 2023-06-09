package section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.model.User;

public interface UserDao {
    User save(User user);

    Optional<User> get(Long id);

    List<User> findAll();

    void delete(Long id);

    User update(User user);
}

package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao;

import java.util.Optional;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.User;

public interface UserDao extends GenericDao<User> {
    Optional<User> findByEmail(String email);

    Optional<User> get(Long id);
}

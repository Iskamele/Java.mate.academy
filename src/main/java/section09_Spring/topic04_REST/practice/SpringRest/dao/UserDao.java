package section09_Spring.topic04_REST.practice.SpringRest.dao;

import java.util.Optional;
import section09_Spring.topic04_REST.practice.SpringRest.model.User;

public interface UserDao extends GenericDao<User> {
    Optional<User> findByEmail(String email);
}

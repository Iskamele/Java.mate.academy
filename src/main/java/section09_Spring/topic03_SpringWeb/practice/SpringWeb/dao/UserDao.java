package section09_Spring.topic03_SpringWeb.practice.SpringWeb.dao;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic03_SpringWeb.practice.SpringWeb.model.User;

public interface UserDao {
    void add(User user);

    List<User> getAll();

    Optional<User> get(Long id);
}

package section09_Spring.topic03_SpringWeb.practice.SpringWeb.service;

import java.util.List;
import section09_Spring.topic03_SpringWeb.practice.SpringWeb.model.User;

public interface UserService {
    void add(User user);

    List<User> getAll();

    User get(Long id);
}

package section09_Spring.topic02_BeanLifeCycle.theory.T03_SingletonAndPrototype.service;

import java.util.List;
import section09_Spring.topic02_BeanLifeCycle.theory.T03_SingletonAndPrototype.model.User;

public interface UserService {
    void add(User user);

    User get(Long id);

    List<User> getAll();
}

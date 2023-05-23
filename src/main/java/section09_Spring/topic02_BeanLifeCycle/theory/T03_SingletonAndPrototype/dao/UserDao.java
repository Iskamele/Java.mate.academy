package section09_Spring.topic02_BeanLifeCycle.theory.T03_SingletonAndPrototype.dao;

import java.util.List;
import section09_Spring.topic02_BeanLifeCycle.theory.T03_SingletonAndPrototype.model.User;

public interface UserDao {
    void add(User user);

    User get(Long id);

    List<User> getAll();
}

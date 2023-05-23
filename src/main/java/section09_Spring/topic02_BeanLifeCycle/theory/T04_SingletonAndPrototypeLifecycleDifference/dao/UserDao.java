package section09_Spring.topic02_BeanLifeCycle.theory.T04_SingletonAndPrototypeLifecycleDifference.dao;

import java.util.List;
import section09_Spring.topic02_BeanLifeCycle.theory.T04_SingletonAndPrototypeLifecycleDifference.model.User;

public interface UserDao {
    void add(User user);

    User get(Long id);

    List<User> getAll();
}

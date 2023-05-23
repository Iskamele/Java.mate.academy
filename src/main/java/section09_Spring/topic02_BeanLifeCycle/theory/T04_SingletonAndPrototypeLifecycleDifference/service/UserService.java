package section09_Spring.topic02_BeanLifeCycle.theory.T04_SingletonAndPrototypeLifecycleDifference.service;

import java.util.List;
import section09_Spring.topic02_BeanLifeCycle.theory.T04_SingletonAndPrototypeLifecycleDifference.model.User;

public interface UserService {
    void add(User user);

    User get(Long id);

    List<User> getAll();
}

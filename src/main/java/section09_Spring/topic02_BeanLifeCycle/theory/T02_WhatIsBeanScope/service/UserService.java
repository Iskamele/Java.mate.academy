package section09_Spring.topic02_BeanLifeCycle.theory.T02_WhatIsBeanScope.service;

import java.util.List;
import section09_Spring.topic02_BeanLifeCycle.theory.T02_WhatIsBeanScope.model.User;

public interface UserService {
    User add(User user);

    User get(Long id);

    List<User> getAll();
}

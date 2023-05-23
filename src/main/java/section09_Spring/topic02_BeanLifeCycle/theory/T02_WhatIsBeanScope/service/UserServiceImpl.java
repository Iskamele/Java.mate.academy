package section09_Spring.topic02_BeanLifeCycle.theory.T02_WhatIsBeanScope.service;

import java.util.List;
import section09_Spring.topic02_BeanLifeCycle.theory.T02_WhatIsBeanScope.dao.UserDao;
import section09_Spring.topic02_BeanLifeCycle.theory.T02_WhatIsBeanScope.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User add(User user) {
        return userDao.add(user);
    }

    @Override
    public User get(Long id) {
        return userDao.get(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}

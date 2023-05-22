package section09_Spring.topic01_SpringIntro.practice.SpringIntro.service.impl;

import java.util.List;
import section09_Spring.topic01_SpringIntro.practice.SpringIntro.dao.UserDao;
import section09_Spring.topic01_SpringIntro.practice.SpringIntro.model.User;
import section09_Spring.topic01_SpringIntro.practice.SpringIntro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User add(User user) {
        return userDao.add(user);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}

package section09_Spring.topic03_SpringWeb.practice.SpringWeb.service;

import java.util.List;
import section09_Spring.topic03_SpringWeb.practice.SpringWeb.dao.UserDao;
import section09_Spring.topic03_SpringWeb.practice.SpringWeb.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public User get(Long id) {
        return userDao.get(id).get();
    }
}

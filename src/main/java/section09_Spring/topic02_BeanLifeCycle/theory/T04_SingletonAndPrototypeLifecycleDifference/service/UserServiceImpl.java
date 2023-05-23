package section09_Spring.topic02_BeanLifeCycle.theory.T04_SingletonAndPrototypeLifecycleDifference.service;

import java.util.List;
import section09_Spring.topic02_BeanLifeCycle.theory.T04_SingletonAndPrototypeLifecycleDifference.dao.UserDao;
import section09_Spring.topic02_BeanLifeCycle.theory.T04_SingletonAndPrototypeLifecycleDifference.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);
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

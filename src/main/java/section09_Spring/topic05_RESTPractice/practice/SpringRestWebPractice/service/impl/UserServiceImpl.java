package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.service.impl;

import java.util.Optional;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao.UserDao;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.User;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.service.UserService;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.util.HashUtil;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User add(User user) {
        user.setSalt(HashUtil.getSalt());
        user.setPassword(HashUtil.hashPassword(user.getPassword(), user.getSalt()));
        return userDao.add(user);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    @Override
    public User get(Long id) {
        return userDao.get(id).get();
    }
}

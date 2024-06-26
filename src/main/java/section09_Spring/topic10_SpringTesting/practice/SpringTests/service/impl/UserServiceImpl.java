package section09_Spring.topic10_SpringTesting.practice.SpringTests.service.impl;

import section09_Spring.topic10_SpringTesting.practice.SpringTests.dao.UserDao;
import java.util.Optional;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.model.User;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserDao userDao, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userDao.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userDao.findByEmail(email);
    }
}

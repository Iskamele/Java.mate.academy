package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.dao.UserDao;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.model.User;
import section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.service.UserService;

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
    public User findById(Long id) {
        return userDao.findById(id)
                .orElseThrow(() -> new RuntimeException("Can't get user by id: " + id));
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}

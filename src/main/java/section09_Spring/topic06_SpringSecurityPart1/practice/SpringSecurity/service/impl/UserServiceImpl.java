package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.impl;

import java.util.Optional;
import org.springframework.stereotype.Service;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dao.UserDao;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.User;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.UserService;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.util.HashUtil;


@Service
public class UserServiceImpl implements UserService {
    private static final int SALT_LENGTH = 10;
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User add(User user) {
        String salt = HashUtil.getSalt(SALT_LENGTH);
        String securePassword = HashUtil.generateSecurePassword(user.getPassword(), salt);
        user.setPassword(securePassword);
        user.setSalt(salt);
        return userDao.add(user);
    }

    @Override
    public User get(Long id) {
        return userDao.get(id).orElseThrow(
                () -> new RuntimeException("User with id " + id + " not found"));
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userDao.findByEmail(email);
    }
}

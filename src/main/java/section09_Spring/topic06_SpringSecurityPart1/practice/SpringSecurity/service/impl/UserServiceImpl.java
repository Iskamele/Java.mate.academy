package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.impl;

import java.util.Optional;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dao.UserDao;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.User;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.service.UserService;


@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserDao userDao, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User add(User user) {
        String securePassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(securePassword);
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

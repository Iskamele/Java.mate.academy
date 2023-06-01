package section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.service;

import java.util.Optional;
import section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.dao.UserDaoImpl;
import section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.exception.AuthenticationException;
import section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.model.User;

public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserDaoImpl userDao;

    public AuthenticationServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public User login (String login, String password) throws AuthenticationException {
        Optional<User> userOptional = userDao.findByLogin(login);
        if (userOptional.isPresent() && userOptional.get().getPassword().equals(password)) {
            return userOptional.get();
        }
        throw new AuthenticationException("Incorrect username or password");
    }
}

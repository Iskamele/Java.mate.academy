package section07_JavaWeb.topic04_SecurityInWeb.theory.T09_Cookie.service;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T09_Cookie.dao.UserDao;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T09_Cookie.dao.UserDaoImpl;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T09_Cookie.exception.AuthenticationException;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T09_Cookie.model.User;

public class AuthenticationServiceImpl implements AuthenticationService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public User login(String username, String password) throws AuthenticationException {
        Optional<User> user = userDao.findByUsername(username);
        if (user.isEmpty()) {
            throw new AuthenticationException("Username or password was incorrect");
        }
        if (user.get().getPassword().equals(password)) {
            return user.get();
        }
        throw new AuthenticationException("Username or password was incorrect");
    }
}

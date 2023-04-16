package section07_JavaWeb.topic04_SecurityInWeb.theory.T05_WhatIsFilter.service;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T05_WhatIsFilter.dao.UserDao;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T05_WhatIsFilter.dao.UserDaoImpl;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T05_WhatIsFilter.exception.AuthenticationException;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T05_WhatIsFilter.model.User;

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

package section07_JavaWeb.topic03_WebPractice.theory.T03_JSPDisplayAListOfObjects.service;

import java.util.List;
import section07_JavaWeb.topic03_WebPractice.theory.T03_JSPDisplayAListOfObjects.dao.UserDao;
import section07_JavaWeb.topic03_WebPractice.theory.T03_JSPDisplayAListOfObjects.model.User;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}

package section07_JavaWeb.topic03_WebPractice.theory.T09_DeleteUserFromDB.service;

import java.util.List;
import section07_JavaWeb.topic03_WebPractice.theory.T09_DeleteUserFromDB.dao.UserDao;
import section07_JavaWeb.topic03_WebPractice.theory.T09_DeleteUserFromDB.model.User;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }
}

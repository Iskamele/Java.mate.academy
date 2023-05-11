package section08_Hibernate.topic06_TransactionIsolationLevels.theory.T02_HowToUseHashing.service;

import java.util.Optional;
import section08_Hibernate.topic06_TransactionIsolationLevels.theory.T02_HowToUseHashing.util.HashUtil;
import section08_Hibernate.topic06_TransactionIsolationLevels.theory.T02_HowToUseHashing.dao.UserDao;
import section08_Hibernate.topic06_TransactionIsolationLevels.theory.T02_HowToUseHashing.model.User;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User save(User user) {
        user.setSalt(HashUtil.getSalt());
        user.setPassword(HashUtil.hashPassword(user.getPassword(), user.getSalt()));
        return userDao.save(user);
    }

    @Override
    public Optional<User> findByLogin(String login) {
        return userDao.findByLogin(login);
    }
}

package section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.service.impl;

import java.util.Optional;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.dao.UserDao;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.lib.Inject;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.lib.Service;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.model.User;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.service.UserService;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.util.HashUtil;

@Service
public class UserServiceImpl implements UserService {
    @Inject
    private UserDao userDao;

    @Override
    public User add(User user) {
        user.setSalt(HashUtil.getSalt());
        user.setPassword(HashUtil.hashPassword(user.getPassword(), user.getSalt()));
        return userDao.add(user);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userDao.findByEmail(email);
    }
}

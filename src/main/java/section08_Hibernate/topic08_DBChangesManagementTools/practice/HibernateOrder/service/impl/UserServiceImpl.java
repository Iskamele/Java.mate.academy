package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service.impl;

import java.util.Optional;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.dao.UserDao;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.lib.Inject;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.lib.Service;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.User;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service.UserService;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.util.HashUtil;


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

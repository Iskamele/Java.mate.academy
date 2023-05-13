package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.service.impl;

import java.util.Optional;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.dao.UserDao;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.lib.Inject;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.lib.Service;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.User;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.service.UserService;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.util.HashUtil;

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

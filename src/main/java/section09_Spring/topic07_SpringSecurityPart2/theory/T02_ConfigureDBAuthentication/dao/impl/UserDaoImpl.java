package section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.dao.impl;

import java.util.List;
import java.util.Optional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.dao.UserDao;
import section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.model.User;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public Optional<User> get(Long id) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public User update(User user) {
        return null;
    }
}

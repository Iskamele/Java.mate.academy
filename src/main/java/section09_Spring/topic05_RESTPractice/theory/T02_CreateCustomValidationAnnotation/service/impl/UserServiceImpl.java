package section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.dao.UserDao;
import section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.model.User;
import section09_Spring.topic05_RESTPractice.theory.T02_CreateCustomValidationAnnotation.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao productDao;

    @Autowired
    public UserServiceImpl(UserDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public User save(User user) {
        return productDao.save(user);
    }

    @Override
    public List<User> findAll() {
        return productDao.findAll();
    }

    @Override
    public User get(Long id) {
        return productDao.get(id).orElseThrow(() ->
                new NoSuchElementException("Can't find user by id: " + id));
    }

    @Override
    public void delete(Long id) {
        productDao.delete(id);
    }
}

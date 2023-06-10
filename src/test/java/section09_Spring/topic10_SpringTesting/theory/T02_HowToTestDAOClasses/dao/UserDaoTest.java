package section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.dao.impl.UserDaoImpl;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.model.Role;
import section09_Spring.topic10_SpringTesting.theory.T02_HowToTestDAOClasses.model.User;

class UserDaoTest extends AbstractTest {
    private UserDao userDao;

    @BeforeEach
    void setUp() {
        userDao = new UserDaoImpl(getSessionFactory());
    }

    @Override
    protected Class<?>[] entities() {
        return new Class[]{User.class, Role.class};
    }

    @Test
    void save_Ok() {
        User bob = new User();
        bob.setEmail("bob@i.ua");
        bob.setPassword("1234");

        User actual = userDao.save(bob);
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(1L, actual.getId());

    }
}
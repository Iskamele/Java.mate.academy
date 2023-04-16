package section07_JavaWeb.topic04_SecurityInWeb.theory.T04_DisplayCustomErrorMessage.dao;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T03_AuthenticationServiceImplementation.dao.UserDao;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T03_AuthenticationServiceImplementation.model.User;

public class UserDaoImpl implements UserDao {
    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.of(new User(username, "1234"));
    }
}

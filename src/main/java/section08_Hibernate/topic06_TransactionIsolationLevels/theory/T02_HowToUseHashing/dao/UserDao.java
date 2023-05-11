package section08_Hibernate.topic06_TransactionIsolationLevels.theory.T02_HowToUseHashing.dao;

import java.util.Optional;
import section08_Hibernate.topic06_TransactionIsolationLevels.theory.T02_HowToUseHashing.model.User;

public interface UserDao {
    User save(User user);

    User get(Long id);

    Optional<User> findByLogin(String login);
}

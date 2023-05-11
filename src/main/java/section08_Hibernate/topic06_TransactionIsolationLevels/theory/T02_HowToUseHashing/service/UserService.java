package section08_Hibernate.topic06_TransactionIsolationLevels.theory.T02_HowToUseHashing.service;

import java.util.Optional;
import section08_Hibernate.topic06_TransactionIsolationLevels.theory.T02_HowToUseHashing.model.User;

public interface UserService {
    User save(User user);

    Optional<User> findByLogin(String login);
}

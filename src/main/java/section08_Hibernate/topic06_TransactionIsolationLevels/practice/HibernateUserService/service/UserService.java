package section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.service;

import java.util.Optional;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.model.User;

public interface UserService {
    User add(User user);

    Optional<User> findByEmail(String email);
}

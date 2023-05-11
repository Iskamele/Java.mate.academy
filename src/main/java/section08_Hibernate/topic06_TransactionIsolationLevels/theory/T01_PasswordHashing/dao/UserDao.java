package section08_Hibernate.topic06_TransactionIsolationLevels.theory.T01_PasswordHashing.dao;

import section08_Hibernate.topic06_TransactionIsolationLevels.theory.T01_PasswordHashing.model.User;

public interface UserDao {
    User save(User user);

    User get(Long id);
}

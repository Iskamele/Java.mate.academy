package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.dao;

import java.util.Optional;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.User;

public interface UserDao {
    User add(User user);

    Optional<User> findByEmail(String email);
}

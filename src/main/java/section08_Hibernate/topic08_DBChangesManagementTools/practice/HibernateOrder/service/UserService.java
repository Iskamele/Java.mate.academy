package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.service;

import java.util.Optional;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.User;


public interface UserService {
    User add(User user);

    Optional<User> findByEmail(String email);
}

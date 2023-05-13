package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.service;

import java.util.Optional;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.User;

public interface UserService {
    User add(User user);

    Optional<User> findByEmail(String email);
}

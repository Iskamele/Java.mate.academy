package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.security;

import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.exception.AuthenticationException;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.exception.RegistrationException;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.User;

public interface AuthenticationService {
    User login(String email, String password) throws AuthenticationException;

    User register(String email, String password) throws RegistrationException;
}

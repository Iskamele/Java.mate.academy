package section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.service;

import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.exception.AuthenticationException;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.exception.RegistrationException;
import section08_Hibernate.topic06_TransactionIsolationLevels.practice.HibernateUserService.model.User;

public interface AuthenticationService {
    User login(String email, String password) throws AuthenticationException;

    User register(String email, String password) throws RegistrationException;
}

package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.security;

import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.exception.AuthenticationException;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.exception.RegistrationException;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.User;

public interface AuthenticationService {
    User login(String email, String password) throws AuthenticationException;

    User register(String email, String password) throws RegistrationException;
}

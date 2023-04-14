package section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.service;

import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.exception.AuthenticationException;
import section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.model.Driver;

public interface AuthenticationService {
    Driver login(String login, String password) throws AuthenticationException;
}

package section07_JavaWeb.topic06_HowToAddProjectToGitHub.service;

import section07_JavaWeb.topic06_HowToAddProjectToGitHub.exception.AuthenticationException;
import section07_JavaWeb.topic06_HowToAddProjectToGitHub.model.Driver;

public interface AuthenticationService {
    Driver login(String login, String password) throws AuthenticationException;
}

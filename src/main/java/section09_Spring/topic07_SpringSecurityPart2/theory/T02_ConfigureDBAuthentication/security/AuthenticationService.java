package section09_Spring.topic07_SpringSecurityPart2.theory.T02_ConfigureDBAuthentication.security;

public interface AuthenticationService {
    void register(String email, String password);
}

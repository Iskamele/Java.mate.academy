package section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.security;

public interface Token {
    String getCredentials();

    String getUsername();
}

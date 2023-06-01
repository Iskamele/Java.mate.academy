package section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.security;

import section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.model.User;

public interface AuthenticationProvider {
    User authenticate(Token token);

    boolean isSupporting(Class<? extends Token>[] classes);
}

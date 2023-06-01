package section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.security;

import section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.model.User;

public class FbAuthenticationProvider
        implements AuthenticationProvider {
    @Override
    public User authenticate(Token token) {
        return null;
    }

    @Override
    public boolean isSupporting(Class<? extends Token>[] classes) {
        for (Class<? extends Token> tokenClass : classes) {
            if (tokenClass.equals(FbAuthToken.class)) {
                return true;
            }
        }
        return false;
    }
}

package section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.security;

import java.util.List;
import section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.model.User;

public class AuthenticationManagerImpl implements AuthenticationManager {
    private List<AuthenticationProvider> providers;

    public AuthenticationManagerImpl(List<AuthenticationProvider> providers) {
        this.providers = providers;
    }

    @Override
    public User authenticate(Token token) {
        Class<Token>[] tokens = new Class[]{token.getClass()};
        return providers.stream()
                .filter(p -> p.isSupporting(tokens))
                .findFirst()
                .get()
                .authenticate(token);
    }
}

package section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.security;

public class FbAuthToken implements Token {
    private String authUrl;

    public FbAuthToken(String authUrl) {
        this.authUrl = authUrl;
    }

    @Override
    public String getCredentials() {
        return authUrl;
    }

    @Override
    public String getUsername() {
        return null;
    }
}

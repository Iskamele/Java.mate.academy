package section09_Spring.topic06_SpringSecurityPart1.theory.T01_SpringSecurityBasics.security;

public class UsernamePasswordAuthToken implements Token {
    private String username;
    private String password;

    public UsernamePasswordAuthToken(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getCredentials() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }
}

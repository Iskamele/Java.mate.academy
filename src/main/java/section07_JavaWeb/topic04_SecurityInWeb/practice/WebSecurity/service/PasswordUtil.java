package section07_JavaWeb.topic04_SecurityInWeb.practice.WebSecurity.service;

public interface PasswordUtil {
    String hashPassword(String password);

    boolean checkPassword(String dbPassword, String loginPassword);
}

package section07_JavaWeb.topic06_HowToAddProjectToGitHub.util;

public interface PasswordUtil {
    String hashPassword(String password);

    boolean checkPassword(String dbPassword, String loginPassword);
}

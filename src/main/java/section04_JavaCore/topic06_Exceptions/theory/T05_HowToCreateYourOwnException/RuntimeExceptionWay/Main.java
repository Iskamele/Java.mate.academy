package section04_JavaCore.topic06_Exceptions.theory.T05_HowToCreateYourOwnException.RuntimeExceptionWay;

public class Main {
    public static void main(String[] args) {
        // How to create my own exception?

        // Authenticate user by login and password

        AuthenticationService service = new AuthenticationService();
        service.authenticate(null, "hello");
    }
}

package section04_JavaCore.topic06_Exceptions.T05_HowToCreateYourOwnException.ExceptionWay;

import section04_JavaCore.topic06_Exceptions.T05_HowToCreateYourOwnException.ExceptionWay.exceptions.AuthenticationException;

public class Main {
    public static void main(String[] args)
            throws AuthenticationException {
        // How to create my own exception?

        // Authenticate user by login and password

        AuthenticationService service = new AuthenticationService();
        service.authenticate(null,"hello");
    }
}

package section04_JavaCore.topic06_Exceptions.theory.T05_HowToCreateYourOwnException.RuntimeExceptionWay;

import section04_JavaCore.topic06_Exceptions.theory.T05_HowToCreateYourOwnException.RuntimeExceptionWay.exceptions.AuthenticationException;

public class AuthenticationService {
    public void authenticate(String login, String password) {
        // go to DB and validate
        // if the password is less than 8 symbols - throw an Exception

        if (password.length() < 8) {
            throw new AuthenticationException("User is not authorized");
        }
    }
}

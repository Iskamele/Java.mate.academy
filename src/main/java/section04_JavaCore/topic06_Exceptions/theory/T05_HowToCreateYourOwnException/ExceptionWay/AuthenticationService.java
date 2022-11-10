package section04_JavaCore.topic06_Exceptions.theory.T05_HowToCreateYourOwnException.ExceptionWay;

import section04_JavaCore.topic06_Exceptions.theory.T05_HowToCreateYourOwnException.ExceptionWay.exceptions.AuthenticationException;

public class AuthenticationService {
    public void authenticate(String login, String password)
            throws AuthenticationException {
        // go to DB and validate
        // if the password is less than 8 symbols - throw an Exception

        if (password.length() < 8) {
            throw new AuthenticationException("User is not authorized");
        }
    }
}

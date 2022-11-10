package section04_JavaCore.topic06_Exceptions.theory.T13_ExceptionConstructorHardcoding;

public class AuthenticationException extends Exception{
    public AuthenticationException(String message) {
        super(message);
    }
}

package section04_JavaCore.topic06_Exceptions.theory.T13_ExceptionConstructorHardcoding.BadExample;

public class AuthenticationException extends Exception{
    public AuthenticationException() {
        super("Login and password are incorrect");
    }
}

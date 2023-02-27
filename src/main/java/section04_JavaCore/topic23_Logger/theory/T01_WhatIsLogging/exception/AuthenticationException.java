package section04_JavaCore.topic23_Logger.theory.T01_WhatIsLogging.exception;

public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

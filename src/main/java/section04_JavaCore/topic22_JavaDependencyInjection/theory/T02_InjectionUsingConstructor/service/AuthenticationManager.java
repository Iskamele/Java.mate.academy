package section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.service;

public interface AuthenticationManager {
    boolean hasPermission(String accountNumber);
}

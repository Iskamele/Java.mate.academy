package section04_JavaCore.topic22_JavaDependencyInjection.theory.T04_InjectorImplementationPartOne.service;

public interface AuthenticationManager {
    boolean hasPermission(String accountNumber);
}

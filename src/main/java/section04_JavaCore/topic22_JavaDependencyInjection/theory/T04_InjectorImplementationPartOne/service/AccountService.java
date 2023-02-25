package section04_JavaCore.topic22_JavaDependencyInjection.theory.T04_InjectorImplementationPartOne.service;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T04_InjectorImplementationPartOne.model.Account;
import java.util.Optional;

public interface AccountService {
    Optional<Account> findByNumber(String accountNumber);

    Optional<Account> findByUser(String username);
}

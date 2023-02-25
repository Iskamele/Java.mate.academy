package section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.service;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.model.Account;
import java.util.Optional;

public interface AccountService {
    Optional<Account> findByNumber(String accountNumber);

    Optional<Account> findByUser(String username);
}

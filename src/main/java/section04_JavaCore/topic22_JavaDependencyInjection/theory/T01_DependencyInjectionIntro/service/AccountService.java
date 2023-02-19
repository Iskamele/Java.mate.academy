package section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.service;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.model.Account;
import java.util.Optional;

public interface AccountService {
    Optional<Account> findByNumber(String accountNumber);

    Optional<Account> findByUser(String username);
}

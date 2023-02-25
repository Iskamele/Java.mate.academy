package section04_JavaCore.topic22_JavaDependencyInjection.theory.T03_InjectorIntroAnnotation.service;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T03_InjectorIntroAnnotation.model.Account;
import java.util.Optional;

public interface AccountService {
    Optional<Account> findByNumber(String accountNumber);

    Optional<Account> findByUser(String username);
}

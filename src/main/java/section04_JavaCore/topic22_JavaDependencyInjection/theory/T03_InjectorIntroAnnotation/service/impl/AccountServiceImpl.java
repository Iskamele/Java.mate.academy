package section04_JavaCore.topic22_JavaDependencyInjection.theory.T03_InjectorIntroAnnotation.service.impl;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T03_InjectorIntroAnnotation.model.Account;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T03_InjectorIntroAnnotation.model.User;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T03_InjectorIntroAnnotation.service.AccountService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountServiceImpl implements AccountService {
    private static final List<Account> accounts = new ArrayList<>();

    static {
        // Only for example
        User bob = new User("bob", 23);
        User alice = new User("alice", 19);

        Account bobAccount = new Account("1234", bob);
        Account aliceAccount = new Account("5678", alice);

        accounts.add(bobAccount);
        accounts.add(aliceAccount);
    }

    @Override
    public Optional<Account> findByNumber(String accountNumber) {
        return accounts.stream().filter(u -> u.getAccountNumber().equals(accountNumber)).findFirst();
    }

    @Override
    public Optional<Account> findByUser(String username) {
        return accounts.stream().filter(u -> u.getOwner().getName().equals(username)).findFirst();
    }
}

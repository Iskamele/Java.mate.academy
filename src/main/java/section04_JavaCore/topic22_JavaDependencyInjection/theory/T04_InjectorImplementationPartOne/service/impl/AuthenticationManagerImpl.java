package section04_JavaCore.topic22_JavaDependencyInjection.theory.T04_InjectorImplementationPartOne.service.impl;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T04_InjectorImplementationPartOne.model.Account;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T04_InjectorImplementationPartOne.model.User;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T04_InjectorImplementationPartOne.service.AccountService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T04_InjectorImplementationPartOne.service.AuthenticationManager;
import java.util.Optional;

public class AuthenticationManagerImpl implements AuthenticationManager {
    private AccountService accountService;
    private User currentUser;

    public AuthenticationManagerImpl(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public boolean hasPermission(String accountNumber) {
        Optional<Account> byNumber = accountService.findByNumber(accountNumber);
        User owner = byNumber.get().getOwner();
        if (owner.equals(currentUser)) {
            return true;
        }
        // if current user is bank operator true
        return false;
    }
}

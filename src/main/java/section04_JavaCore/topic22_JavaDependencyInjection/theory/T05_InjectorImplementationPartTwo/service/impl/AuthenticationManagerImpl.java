package section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.service.impl;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.lib.Inject;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.model.Account;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.model.User;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.service.AccountService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T05_InjectorImplementationPartTwo.service.AuthenticationManager;
import java.util.Optional;

public class AuthenticationManagerImpl implements AuthenticationManager {
    @Inject
    private AccountService accountService;
    private User currentUser;

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

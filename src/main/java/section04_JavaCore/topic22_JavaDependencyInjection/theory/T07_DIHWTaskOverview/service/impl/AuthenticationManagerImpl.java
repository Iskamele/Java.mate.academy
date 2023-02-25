package section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.service.impl;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.lib.Component;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.lib.Inject;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.model.Account;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.model.User;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.service.AccountService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.service.AuthenticationManager;
import java.util.Optional;

@Component
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

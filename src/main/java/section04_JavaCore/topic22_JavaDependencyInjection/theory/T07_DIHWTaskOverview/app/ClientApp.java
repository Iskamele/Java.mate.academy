package section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.app;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.lib.Inject;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.model.Account;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.model.User;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.service.AccountService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.service.BankService;
import java.math.BigDecimal;
import java.util.Optional;

public class ClientApp {
    @Inject
    private BankService bankService;
    @Inject
    private AccountService accountService;
    private User currentUser;

    public void sendMoney(String to, BigDecimal amount) {
        Optional<Account> userAccount = accountService.findByUser(currentUser.getName());
        if (userAccount.isEmpty()) {
            throw new RuntimeException("User does not have an account");
        }
        bankService.transfer(userAccount.get().getAccountNumber(), to, amount);
    }

    public void login(String login, String phoneNumber) {
        // some logic how to login user
        this.currentUser = new User("bob", 23);
    }
}

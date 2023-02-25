package section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.app;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.model.Account;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.model.User;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.service.AccountService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.service.BankService;
import java.math.BigDecimal;
import java.util.Optional;

public class AtmApp {
    private final BankService bankService;
    private final AccountService accountService;
    private User currentUser;

    public AtmApp(BankService bankService, AccountService accountService) {
        this.bankService = bankService;
        this.accountService = accountService;
    }

    public void sendMoney(String to, BigDecimal amount) {
        Optional<Account> userAccount = accountService.findByUser(currentUser.getName());
        if (userAccount.isEmpty()) {
            throw new RuntimeException("User does not have an account");
        }
        bankService.transfer(userAccount.get().getAccountNumber(), to, amount);
    }

    public void login(String phoneNumber) {
        // some logic how to login user
        this.currentUser = new User("bob", 23);
    }
}

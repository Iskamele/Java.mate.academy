package section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.app;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.model.Account;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.model.User;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.service.AccountService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.service.BankService;
import java.math.BigDecimal;
import java.util.Optional;

public class AtmApp {
    private BankService bankService;
    private AccountService accountService;
    private User currentUser;

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

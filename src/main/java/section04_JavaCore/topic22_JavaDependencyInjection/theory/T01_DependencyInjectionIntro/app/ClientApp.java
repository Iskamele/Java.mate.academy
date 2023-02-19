package section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.app;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.model.Account;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.model.User;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.service.AccountService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.service.BankService;
import java.math.BigDecimal;
import java.util.Optional;

public class ClientApp {
    private BankService bankService;
    private AccountService accountService;
    private User currentUser;

    // 1 способ реализации Dependency Injection
    /*
    public ClientApp(BankService bankService, AccountService accountService) {
        this.bankService = bankService;
        this.accountService = accountService;
    }
    */

    // 2 способ
    /*
    public void setBankService(BankService bankService) {
        this.bankService = bankService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }
     */

    // 3 способ: field injection с помощью Java Reflection API
    // или с помощью рефлексии. Для этого нужен отдельный класс-инжектор

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

package section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.app.AtmApp;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.service.AuthenticationManager;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.service.BankService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.app.ClientApp;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.service.AccountService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.service.impl.AccountServiceImpl;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.service.impl.AuthenticationManagerImpl;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.service.impl.BankServiceImpl;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        AccountService accountService = new AccountServiceImpl();
        AuthenticationManager authenticationManager = new AuthenticationManagerImpl(accountService);
        BankService bankService = new BankServiceImpl(accountService, authenticationManager);
        ClientApp clientApp = new ClientApp(bankService, accountService);
        clientApp.login("bob", "1234");
        clientApp.sendMoney("5678", BigDecimal.valueOf(100));

        AtmApp atmApp = new AtmApp(bankService, accountService);
        atmApp.login("12345");
        atmApp.sendMoney("5678", BigDecimal.valueOf(200));
    }
}

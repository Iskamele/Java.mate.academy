package section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.service.impl;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.lib.Component;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.lib.Inject;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.model.Account;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.service.AccountService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.service.AuthenticationManager;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.service.BankService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.service.LogService;
import java.math.BigDecimal;
import java.util.Optional;

@Component
public class BankServiceImpl implements BankService {
    @Inject
    private AccountService accountService;
    @Inject
    private AuthenticationManager authenticationManager;
    @Inject
    private LogService logService;

    @Override
    public void transfer(String accountFrom, String accountTo, BigDecimal amount) {
        logService.log("method transfer was called...");
        Optional<Account> sender = accountService.findByNumber(accountFrom);
        Optional<Account> receiver = accountService.findByNumber(accountTo);

        if (sender.isEmpty() || receiver.isEmpty()) {
            throw new RuntimeException("Can't send money from " + accountFrom + " to " + accountTo);
        }

        if (!authenticationManager.hasPermission(accountFrom)) {
            System.out.println("You cannot send money ...");
        }

        if (sender.get().getBalance().compareTo(amount) < 0) {
            System.out.println("Not enough money ...");
        }
        // Реализация остальной бизнес-логики
    }
}

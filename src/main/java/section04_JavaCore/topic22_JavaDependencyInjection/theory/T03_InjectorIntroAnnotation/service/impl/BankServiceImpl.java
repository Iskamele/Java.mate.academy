package section04_JavaCore.topic22_JavaDependencyInjection.theory.T03_InjectorIntroAnnotation.service.impl;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T03_InjectorIntroAnnotation.model.Account;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T03_InjectorIntroAnnotation.service.AccountService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T03_InjectorIntroAnnotation.service.AuthenticationManager;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T03_InjectorIntroAnnotation.service.BankService;
import java.math.BigDecimal;
import java.util.Optional;

public class BankServiceImpl implements BankService {
    private final AccountService accountService;
    private AuthenticationManager authenticationManager;

    public BankServiceImpl(AccountService accountService, AuthenticationManager authenticationManager) {
        this.accountService = accountService;
        this.authenticationManager = authenticationManager;
    }

    @Override
    public void transfer(String accountFrom, String accountTo, BigDecimal amount) {
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

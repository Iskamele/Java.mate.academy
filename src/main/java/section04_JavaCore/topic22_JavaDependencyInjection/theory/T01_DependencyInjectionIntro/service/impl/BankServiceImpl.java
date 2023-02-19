package section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.service.impl;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.model.Account;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.service.AccountService;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.service.BankService;
import java.math.BigDecimal;
import java.util.Optional;

public class BankServiceImpl implements BankService {
    private AccountService accountService;

    @Override
    public void transfer(String accountFrom, String accountTo, BigDecimal amount) {
        Optional<Account> sender = accountService.findByNumber(accountFrom);
        Optional<Account> receiver = accountService.findByNumber(accountTo);

        if (sender.isEmpty() || receiver.isEmpty()) {
            throw new RuntimeException("Can't send money from " + accountFrom + " to " + accountTo);
        }
        if (sender.get().getBalance().compareTo(amount) < 0) {
            throw new RuntimeException("Not enough money ...");
        }
        // Реализация остальной бизнес-логики
    }
}

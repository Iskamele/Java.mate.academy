package section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.app;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T02_InjectionUsingConstructor.service.BankService;
import java.math.BigDecimal;

public class BankOperatorApp {
    private BankService bankService;

    public void sendMoney(String from, String to, BigDecimal amount) {
        bankService.transfer(from, to, amount);
    }
}

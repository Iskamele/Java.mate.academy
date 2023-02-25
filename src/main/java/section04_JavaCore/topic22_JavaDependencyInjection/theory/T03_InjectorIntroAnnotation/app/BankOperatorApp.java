package section04_JavaCore.topic22_JavaDependencyInjection.theory.T03_InjectorIntroAnnotation.app;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T03_InjectorIntroAnnotation.service.BankService;
import java.math.BigDecimal;

public class BankOperatorApp {
    private BankService bankService;

    public void sendMoney(String from, String to, BigDecimal amount) {
        bankService.transfer(from, to, amount);
    }
}

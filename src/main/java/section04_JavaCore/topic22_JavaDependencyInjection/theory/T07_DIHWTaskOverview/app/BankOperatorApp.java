package section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.app;

import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.lib.Inject;
import section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.service.BankService;
import java.math.BigDecimal;

public class BankOperatorApp {
    @Inject
    private BankService bankService;

    public void sendMoney(String from, String to, BigDecimal amount) {
        bankService.transfer(from, to, amount);
    }
}

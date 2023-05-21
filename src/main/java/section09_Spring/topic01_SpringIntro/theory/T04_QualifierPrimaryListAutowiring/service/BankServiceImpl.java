package section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.service;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.model.User;

@Service
public class BankServiceImpl implements BankService {
    @Autowired
    // TODO второй вариант решения. Решение ок, но не годится для динамичности
    @Qualifier("goldCommissionHandler")
    private CommissionHandler commissionHandler;

    @Override
    public void pay(int serviceId, BigDecimal amount, User user) {
        commissionHandler.getCommission(amount);
        // TODO rest of logic
    }
}

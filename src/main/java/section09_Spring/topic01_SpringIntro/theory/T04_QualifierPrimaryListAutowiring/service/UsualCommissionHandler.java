package section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.service;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;
import section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.model.Card;

@Service
// TODO один из вариантов решения, если у нас есть главной реализации
// @Primary
public class UsualCommissionHandler implements CommissionHandler {
    @Override
    public BigDecimal getCommission(BigDecimal amount) {
        System.out.println("UsualCommissionHandler invoked");
        return amount.multiply(BigDecimal.valueOf(0.05));
    }

    @Override
    public boolean isApplicable(Card.CardType cardType) {
        return cardType.equals(Card.CardType.USUAL);
    }
}

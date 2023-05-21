package section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.service;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;
import section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.model.Card;

@Service
public class GoldCommissionHandler implements CommissionHandler{
    @Override
    public BigDecimal getCommission(BigDecimal amount) {
        System.out.println("GoldCommissionHandler invoked");
        return BigDecimal.ZERO;
    }

    @Override
    public boolean isApplicable(Card.CardType cardType) {
        return cardType.equals(Card.CardType.GOLD);
    }
}

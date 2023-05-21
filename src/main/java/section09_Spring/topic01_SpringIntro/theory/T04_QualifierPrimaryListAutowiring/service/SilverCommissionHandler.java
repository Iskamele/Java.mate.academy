package section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.service;

import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.model.Card;

// TODO можно использовать аннотацию Service, но будет логичнее ставить её там, где класс подписан, как сервис
@Component
public class SilverCommissionHandler implements CommissionHandler {
    @Override
    public BigDecimal getCommission(BigDecimal amount) {
        return null;
    }

    @Override
    public boolean isApplicable(Card.CardType cardType) {
        return false;
    }
}

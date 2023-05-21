package section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.service;

import java.math.BigDecimal;
import section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.model.Card;

public interface CommissionHandler {
    BigDecimal getCommission(BigDecimal amount);

    boolean isApplicable(Card.CardType cardType);
}

package section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.model.Card;
import java.util.List;
import java.util.NoSuchElementException;

@Component
public class CommissionHandledStrategy {
    @Autowired
    private List<CommissionHandler> commissionHandlers;

    public CommissionHandler getHandler(Card.CardType cardType) {
        return commissionHandlers.stream()
                .filter(h -> h.isApplicable(cardType))
                .findFirst().orElseThrow(NoSuchElementException::new);
    }
}

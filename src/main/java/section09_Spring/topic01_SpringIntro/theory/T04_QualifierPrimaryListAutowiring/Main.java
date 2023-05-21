package section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring;

import java.math.BigDecimal;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.config.AppConfig;
import section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.model.Card;
import section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.model.User;
import section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.service.CommissionHandledStrategy;
import section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.service.CommissionHandler;

public class Main {

    public static void main(String[] args) {
        User bob = new User("Bob", "Alison");
        Card bobsCard = new Card("12345", Card.CardType.USUAL);
        bob.setCard(bobsCard);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CommissionHandledStrategy handledStrategy = context.getBean(CommissionHandledStrategy.class);
        CommissionHandler handler = handledStrategy.getHandler(Card.CardType.USUAL);
        handler.getCommission(BigDecimal.valueOf(100));
    }
}

package section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.model;

public class Card {
    private String cardNumber;
    private CardType cardType;

    public Card(String cardNumber, CardType cardType) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }

    public enum CardType {
        USUAL, GOLD
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}

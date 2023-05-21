package section09_Spring.topic01_SpringIntro.theory.T04_QualifierPrimaryListAutowiring.model;

public class User {
    private String name;
    private String lastname;
    private Card card;

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}

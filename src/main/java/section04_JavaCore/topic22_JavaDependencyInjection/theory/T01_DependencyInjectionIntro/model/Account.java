package section04_JavaCore.topic22_JavaDependencyInjection.theory.T01_DependencyInjectionIntro.model;

import java.math.BigDecimal;

public class Account {
    private final User owner;
    private final String accountNumber;
    private BigDecimal balance;

    public Account(String accountNumber, User owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;

    }

    public User getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}

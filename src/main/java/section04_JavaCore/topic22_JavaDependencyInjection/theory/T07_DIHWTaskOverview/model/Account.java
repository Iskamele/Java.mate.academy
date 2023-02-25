package section04_JavaCore.topic22_JavaDependencyInjection.theory.T07_DIHWTaskOverview.model;

import java.math.BigDecimal;

public class Account {
    private final User owner;
    private final String accountNumber;
    private BigDecimal balance;

    public Account(String accountNumber, User owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = BigDecimal.valueOf(0);
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

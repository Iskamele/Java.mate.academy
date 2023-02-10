package section04_JavaCore.topic21_JavaSOLID.theory.T02_SOLID_SRP.model;

import java.math.BigDecimal;

public class Account {
    private String accountMaster;
    private String number;
    private BigDecimal amount = new BigDecimal(0);

    public Account(String accountMaster, String number) {
        this.accountMaster = accountMaster;
        this.number = number;
    }

    public String getAccountMaster() {
        return accountMaster;
    }

    public void setAccountMaster(String accountMaster) {
        this.accountMaster = accountMaster;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountMaster='" + accountMaster + '\'' +
                ", number='" + number + '\'' +
                ", amount=" + amount +
                '}';
    }
}

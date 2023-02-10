package section04_JavaCore.topic21_JavaSOLID.theory.T03_SOLID_OCP.model;

import java.math.BigDecimal;

public class Account {
    private String master;
    private String number;
    private BigDecimal amount = new BigDecimal(0);
    private Type type;

    public Account(String master, String number) {
        this.master = master;
        this.number = number;
        this.type = Type.USUAL;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountMaster='" + master + '\'' +
                ", number='" + number + '\'' +
                ", amount=" + amount +
                ", type=" + type +
                '}';
    }

    public enum Type {
        REGULAR, GOLD, PLATINUM, USUAL, ULTRA;
    }
}

package section04_JavaCore.topic04_OOP.theory.T08_Encapsulation;

public class BankAccount {
    private double amount = 0;


    public double getAmount() {
        return amount;
    }

    public void acceptAmount(int amount){
        if (amount <= getAmount()){
            System.out.println("Amount should be less or equal to " + getAmount());
            return;
        }
        this.amount = this.amount + amount;
    }
}

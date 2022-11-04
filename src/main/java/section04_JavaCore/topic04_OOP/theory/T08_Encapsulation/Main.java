package section04_JavaCore.topic04_OOP.theory.T08_Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.acceptAmount(10);
        account.acceptAmount(+ 20);
        account.acceptAmount(- 100);
        System.out.println(account.getAmount());
    }
}

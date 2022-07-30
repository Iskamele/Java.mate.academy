package section02_JavaBasicsExtended.topic01_EnviromentSetup.practice;

public class BankDeposit {
    public static void main(String[] args) {
        System.out.println(calculateProfit(1000.0, 0.05)); // 50
        System.out.println(calculateProfit(12550.0, 0.03)); // 376
        System.out.println(calculateProfit(11111.0, 0.03)); // 333
        System.out.println(calculateProfit(15000.0, 0.05)); // 750
        System.out.println(calculateProfit(250.0, 0.00)); // 0
        System.out.println(calculateProfit(9550.0, 0.03)); // 286
    }

    public static int calculateProfit(double amount, double percent) {
        return (int) (amount * percent);
    }
}

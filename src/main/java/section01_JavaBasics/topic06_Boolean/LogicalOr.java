package section01_JavaBasics.topic06_Boolean;

public class LogicalOr {
    public static void main(String[] args) {
        int cashInWallet = 30;
        int cardAmount = 100;

        int price = 40;

        boolean canPayWithCard = cardAmount >= price;
        boolean hasEnoughCash = cashInWallet >= price;

        boolean canBuy = canPayWithCard || hasEnoughCash;
        System.out.println(canBuy);
    }
}

package section01_JavaBasics.topic06_Boolean;

public class LogicalEnd {
    public static void main(String[] args) {
        int cashInWallet = 50;
        int age = 33;

        int price = 48;
        int ageLimit = 18;

        boolean isAllowed = age >= ageLimit;
        boolean isEnoughMoney = cashInWallet >= price;

        boolean canBuy = isAllowed && isEnoughMoney;
        System.out.println(canBuy);
    }
}

package section01_JavaBasics.topic01_MainConcepts;

public class CheckMyCash {
    public static void main(String[] args) {
        // There is $10 in your wallet
        int cash = 10;

        // cookie prise is $8
        int cookiePrice = 8;

        // candy prise is $7
        int candyPrice = 7;

        int totalPrice = cookiePrice + candyPrice;

        // can you buy both cookie and candy?
        if(cash > totalPrice) {
            System.out.println("You can buy cookie and candy");
        } else {
            System.out.println("You can not buy cookie and candy");
        }
    }
}

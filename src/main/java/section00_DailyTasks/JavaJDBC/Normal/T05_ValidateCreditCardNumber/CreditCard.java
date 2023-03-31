
package section00_DailyTasks.JavaJDBC.Normal.T05_ValidateCreditCardNumber;

public class CreditCard {
    public static boolean isValidCardNumber(String cardNumber) {
        if (cardNumber.length() > 16) {
          return false;
        }
        int index = 0;
        if (cardNumber.length() / 2 != 0) {
            index++;
        }
        while (index < cardNumber.length() - 1) {
            Integer integer = Integer.valueOf(cardNumber.charAt(index));
            index += 2;
        }

//        IntStream.iterate()
//                .limit(cardNumber.length() / 2 + 1)
//                .forEach(System.out::print);
        return false;
    }
}

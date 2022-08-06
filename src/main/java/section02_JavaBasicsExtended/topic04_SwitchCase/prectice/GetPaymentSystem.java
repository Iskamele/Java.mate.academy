package section02_JavaBasicsExtended.topic04_SwitchCase.prectice;

public class GetPaymentSystem {
    public static void main(String[] args) {
        System.out.println(getPaymentSystem(52));
    }

    public static String getPaymentSystem(int number) {
        switch (number) {
            case 4:
                return "VISA";
            case 34:
            case 37:
                return "American Express";
            case 52:
            case 53:
            case 54:
            case 55:
                return "MasterCard";
            case 63:
            case 67:
                return "Maestro";
            default:
                return "unknown payment system";
        }
    }
}

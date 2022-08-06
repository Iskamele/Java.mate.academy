package section02_JavaBasicsExtended.topic04_SwitchCase.prectice;

public class SimplifyOddEven {
    public static void main(String[] args) {
        System.out.println(isOddOrEven(4));
    }
    public static String isOddOrEven(int number) {
        switch (number) {
            case 1:
            case 3:
            case 5:
                return "odd";
            case 2:
            case 4:
            case 6:
                return "even";
            default:
                return "other number";
        }
    }
}

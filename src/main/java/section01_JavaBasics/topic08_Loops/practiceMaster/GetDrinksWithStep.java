package section01_JavaBasics.topic08_Loops.practiceMaster;

public class GetDrinksWithStep {
    public static void main(String[] args) {
        System.out.println(getDrinksWithStep(10, 3));
        System.out.println(getDrinksWithStep(0, 5));
        System.out.println(getDrinksWithStep(5, 3));
        System.out.println(getDrinksWithStep(18, 10));
    }

    public static int getDrinksWithStep(int guestNumber, int step) {
        int sum = 0;
        for (int i = 1; 1 <= guestNumber; i += step) {
            sum += i;
        }
        return sum;
    }
}


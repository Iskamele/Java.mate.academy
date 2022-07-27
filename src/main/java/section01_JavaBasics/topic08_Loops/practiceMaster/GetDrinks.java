package section01_JavaBasics.topic08_Loops.practiceMaster;

public class GetDrinks {
    public static void main(String[] args) {
        System.out.println(getDrinks(5));
    }
    public static int getDrinks(int guestNumber) {
        int sum = 0;
        for (int i = 1; i <= guestNumber; i++) {
            sum+=i;
        }
        return sum;
    }
}
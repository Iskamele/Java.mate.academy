package section01_JavaBasics.topic08_Loops.practice;

public class GetDrinksWithStep {
    public static void main(String[] args) {
        System.out.println(getDrinksWithStep(10, 3));
        System.out.println(getDrinksWithStep(0, 5));
        System.out.println(getDrinksWithStep(5,3));
        System.out.println(getDrinksWithStep(18, 10));
    }
    public static int getDrinksWithStep(int guestNumber, int step) {
                int answer = 0;

        for (int i = 0; i < guestNumber; i+=step){
            answer = answer + 1 + i;
        }

        return answer;
            }
}

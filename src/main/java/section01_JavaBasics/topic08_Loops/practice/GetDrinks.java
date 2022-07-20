package section01_JavaBasics.topic08_Loops.practice;

public class GetDrinks {
    public static void main(String[] args) {
        System.out.println(getDrinks(5));
    }
    public static int getDrinks(int guestNumber) {
        int answer = 0;
        for (int i = 0; i < guestNumber; i++){
            answer = answer + 1 + i;
        }
        return answer;
    }
}

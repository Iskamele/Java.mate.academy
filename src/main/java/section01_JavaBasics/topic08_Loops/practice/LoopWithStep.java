package section01_JavaBasics.topic08_Loops.practice;

public class LoopWithStep {

    public static void main(String[] args) {
        System.out.println(getSum(100, 5));
    }

    public static int getSum(int n, int step) {
        int result = 0;

        for (int i = 0; i <= n ; i += step) {
            result += i;
        }
        return result;
    }
}

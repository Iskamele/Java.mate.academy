package section01_JavaBasics.topic08_Loops.practice;

public class LoopPractice {
    public static void main(String[] args) {
        System.out.println(getSum(5));
    }
    public static int getSum(int n) {
        int result = 0;

        for (int i = 0; i <= n; i = i + 1) {
            result += i;
        }

        return result;
    }
}

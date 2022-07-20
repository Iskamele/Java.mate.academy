package section01_JavaBasics.topic08_Loops.practice;

public class BackwardsLoop {
    public static void main(String[] args) {
        System.out.println(getSum(9));
    }
    public static int getSum(int n) {
        int result = 0;

        for (int i = n; i >= 0 ; i--) {
            result += i;
        }

        return result;
    }
}

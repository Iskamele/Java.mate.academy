package section01_JavaBasics.topic11_Practice;

public class SumAfterNumber {
    public static void main(String[] args) {
        System.out.println(getSum(new int[]{1, 2, 3}, 1));
        System.out.println(getSum(new int[]{10, 2, 50, 3, 4, 0}, 50));
        System.out.println(getSum(new int[]{10, 2, 50, 3, 4, 0}, -100));
        System.out.println(getSum(new int[]{10}, 10));
    }

    public static int getSum(int[] values, int startValue) {
        int result = 0;
        for (int i = 0; i < values.length; i++)
            if (values[i] == startValue) {
                for (int j = i + 1; j < values.length; j++) {
                    result += values[j];
                }
                break;
            }
        return result;
    }
}

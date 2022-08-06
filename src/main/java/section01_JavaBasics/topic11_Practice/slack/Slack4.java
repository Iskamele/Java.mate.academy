package section01_JavaBasics.topic11_Practice.slack;

public class Slack4 {
    public static void main(String[] args) {
        System.out.println(getSum(new int[]{1, 2, 3}, 1));
        System.out.println(getSum(new int[]{10, 2, 50, 3, 4, 0}, 50));
        System.out.println(getSum(new int[]{10, 2, 50, 3, 4, 0}, -100));
        System.out.println(getSum(new int[]{10}, 10));
    }

    public static int getSum(int[] values, int startValue) {
        for (int value : values) {
            if (value != startValue) {
                return 0;
            }
        }
        if (values.length == 1 && values[0] == startValue) {
            return 0;
        }
        int findIndexStartValue = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == startValue) {
                findIndexStartValue = i;
            }
        }
        int sum = 0;
        for (int j = findIndexStartValue + 1; j < values.length; j++) {
            sum = sum + values[j];
        }
        return sum;
    }
}

package section01_JavaBasics.topic11_Practice.practiceMaster;

public class SumAfterNumber {
    public static void main(String[] args) {
        System.out.println(getSum(new int[]{1, 2, 3}, 1));
        System.out.println(getSum(new int[]{10, 2, 50, 3, 4, 0}, 50));
        System.out.println(getSum(new int[]{10, 2, 50, 3, 4, 0}, -100));
        System.out.println(getSum(new int[]{10}, 10));
    }

    public static int getSum(int[] values, int startValue) {
        boolean startValueFound = false;
        int sum = 0;
        for (int element : values) {
            if (startValueFound) {
                sum += element;
            }
            if (element == startValue) {
                startValueFound = true;
            }
        }
        return sum;
    }
}

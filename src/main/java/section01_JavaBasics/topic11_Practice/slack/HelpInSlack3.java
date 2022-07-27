package section01_JavaBasics.topic11_Practice.slack;

public class HelpInSlack3 {
    public static void main(String[] args) {
        System.out.println(getSum(new int[]{3, 3, 3}, 3));
        System.out.println(getSum(new int[]{9, -12, 0, 4, -59, -1}, -12));
    }

    public static int getSum(int[] values, int startValue) {
        int sum = 0;
        int number = 0;
        int last = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] == startValue && values.length > 1) {

                number = i;
                for (int j = number + 1; j < values.length; j++) {
                    sum = values[j] + sum;
                    last = sum - values[number];
                }
            } else if (values[i] != startValue) {
                return 0;
            } else if (values.length == 1 && values[i] == startValue) {
                return 0;
            }
        }
        return last;
    }
}


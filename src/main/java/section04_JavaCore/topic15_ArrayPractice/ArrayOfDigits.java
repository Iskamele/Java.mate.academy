package section04_JavaCore.topic15_ArrayPractice;

import java.util.Arrays;

public class ArrayOfDigits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(toArrayOfDigits(-46156)));
    }

    public static int[] toArrayOfDigits(int n) {
        if (n < 0) {
            n = -n;
        }
        System.out.println(n);
        StringBuilder s = new StringBuilder();
        for (; n > 0; n /= 10) {
            s.append(n % 10);
            s.append(" ");
        }
        String[] array = s.toString().split(" ");
        System.out.println(Arrays.toString(array));
        int[] answer = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            answer[i] = Integer.parseInt(array[i]);
        }
        return answer;
    }
}

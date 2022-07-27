package section01_JavaBasics.topic11_Practice.practiceMaster;

import java.util.Arrays;

public class CountTheMonkeys {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countTheMonkeys(5))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(countTheMonkeys(8))); // [1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println(Arrays.toString(countTheMonkeys(0))); // [] (порожній масив)
    }

    public static int[] countTheMonkeys(int count) {
        int[] monkeys = new int[count];
        for (int i = 0; i < count; i++) {
            // since indexes start from 0, but values should start from 1
            monkeys[i] = i + 1;
        }
        return monkeys;
    }
}

package section01_JavaBasics.topic11_Practice.practiceMaster;

import java.util.Arrays;

public class GetHighestAndLowestAge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getHighestAndLowestAge(new int[]{10, 40, 36}))); // [40, 10]
        System.out.println(Arrays.toString(getHighestAndLowestAge(new int[]{60, 4, 14, 20, 97}))); // [97, 4]
        System.out.println(Arrays.toString(getHighestAndLowestAge(new int[]{35}))); // [35, 35]
    }

    public static int[] getHighestAndLowestAge(int[] ages) {
        // assign highest and lowest default values to first element in array
        int highestAge = ages[0];
        int lowestAge = ages[0];

        // iterate through every element in array
        for (int age : ages) {
            // if current value is higher than current highest - reassign highest value to age
            if (age > highestAge) {
                highestAge = age;
            }
            // if current value is smaller than current lowest - reassign lowest value to age
            if (age < lowestAge) {
                lowestAge = age;
            }
        }
        return new int[]{highestAge, lowestAge};
    }
}

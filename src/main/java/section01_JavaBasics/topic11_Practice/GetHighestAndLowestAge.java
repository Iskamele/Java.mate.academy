package section01_JavaBasics.topic11_Practice;

import java.util.Arrays;

public class GetHighestAndLowestAge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getHighestAndLowestAge(new int[]{10, 40, 36}))); // [40, 10]
        System.out.println(Arrays.toString(getHighestAndLowestAge(new int[]{60, 4, 14, 20, 97}))); // [97, 4]
        System.out.println(Arrays.toString(getHighestAndLowestAge(new int[]{35}))); // [35, 35]
    }
    public static int[] getHighestAndLowestAge(int[] ages) {
        int highestAge = ages[0];
        int lowestAge = ages[0];

        for (int age : ages){
            if (highestAge < age){
                highestAge = age;
            }
            if (lowestAge > age){
                lowestAge = age;
            }
        }
        return new int[]{highestAge, lowestAge};
    }
}

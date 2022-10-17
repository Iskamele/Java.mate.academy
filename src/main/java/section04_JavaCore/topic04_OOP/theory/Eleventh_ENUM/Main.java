package section04_JavaCore.topic04_OOP.theory.Eleventh_ENUM;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        System.out.println(autumn);

        Season[] values = Season.values();
        System.out.println(Arrays.toString(values));
    }
}

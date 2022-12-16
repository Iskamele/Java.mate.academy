package section04_JavaCore.topic11_ArrayList.theory.T03_ArrayVsCollection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // array with collection
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        List<Integer> list = new ArrayList<>();

        // boxing
        list.add(10);
        list.get(0);

        //Integer integer = list.get(0);

        // unboxing
        int integer = list.get(0);

        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);
        list.add(21);
        list.add(22);
    }
}

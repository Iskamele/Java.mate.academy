package section04_JavaCore.topic04_OOP.theory.T12_Random;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int value = random.nextInt(100);
        System.out.println(value);
    }
}

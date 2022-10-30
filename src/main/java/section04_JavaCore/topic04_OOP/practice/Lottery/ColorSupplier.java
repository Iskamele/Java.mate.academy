package section04_JavaCore.topic04_OOP.practice.Lottery;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        return Colors.values()[index];
    }
}

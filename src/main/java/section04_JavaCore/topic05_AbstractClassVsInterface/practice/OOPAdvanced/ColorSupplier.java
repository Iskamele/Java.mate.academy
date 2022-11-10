package section04_JavaCore.topic05_AbstractClassVsInterface.practice.OOPAdvanced;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        return Colors.values()[index].name();
    }
}

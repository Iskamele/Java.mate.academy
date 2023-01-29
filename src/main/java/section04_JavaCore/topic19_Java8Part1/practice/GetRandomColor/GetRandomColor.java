package section04_JavaCore.topic19_Java8Part1.practice.GetRandomColor;

import java.util.Random;
import java.util.function.Supplier;

public class GetRandomColor implements Supplier<String> {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    @Override
    public String get() {
        return COLORS[new Random().nextInt(COLORS.length)];
    }
}

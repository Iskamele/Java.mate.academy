package section00_DailyTasks.JavaCore.Easy.T25_CountSheep;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountSheepWithStream {

    public static String countSheep(int number) {
        return IntStream.range(1, number + 1)
                .boxed()
                .map(i -> i + " sheep...")
                .collect(Collectors.joining());
    }
}

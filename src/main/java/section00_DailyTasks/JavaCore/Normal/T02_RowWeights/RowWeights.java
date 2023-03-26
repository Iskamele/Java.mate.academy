package section00_DailyTasks.JavaCore.Normal.T02_RowWeights;

import java.util.stream.IntStream;

public class RowWeights {
    public static int[] getTotalWeight(int[] weights) {
        int[] result = {0, 0};
        IntStream.range(0, weights.length)
                .forEach(i -> result[(i % 2 == 0) ? 0 : 1] += weights[i]);
        return result;
    }
}

package section00_DailyTasks.Daily_01.Easy.T10_SumStream;

import java.util.List;

public class SumStream {
    public static int sumStream(List<Integer> list) {
        return list.stream()
                .filter(i -> i > 10)
                .mapToInt(Integer::intValue)
                .sum();
    }
}

package section00_DailyTasks.JavaCore.Easy.T05_GetAverageMark;

import java.util.stream.IntStream;

public class GetAverageMark {
    public static int getAverageMark(int[] marks) {
        return (int) IntStream.of(marks)
                .average()
                .orElse(Double.NaN);

    }
}

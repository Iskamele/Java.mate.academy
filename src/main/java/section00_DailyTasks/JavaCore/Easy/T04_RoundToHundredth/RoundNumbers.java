package section00_DailyTasks.JavaCore.Easy.T04_RoundToHundredth;

import java.text.DecimalFormat;

public class RoundNumbers {
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.##");

    public static double roundToHundredth(double num) {
        return Double.parseDouble(DECIMAL_FORMAT.format(num));
    }
}

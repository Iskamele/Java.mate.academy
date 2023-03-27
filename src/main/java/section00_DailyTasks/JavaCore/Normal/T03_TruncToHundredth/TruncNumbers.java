package section00_DailyTasks.JavaCore.Normal.T03_TruncToHundredth;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TruncNumbers {
    public static double truncateToHundredth(double num) {
        return new BigDecimal(num).setScale(2, RoundingMode.DOWN).doubleValue();
    }
}

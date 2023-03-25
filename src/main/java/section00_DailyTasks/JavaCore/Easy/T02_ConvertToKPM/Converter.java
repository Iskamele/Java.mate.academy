package section00_DailyTasks.JavaCore.Easy.T02_ConvertToKPM;

import java.text.DecimalFormat;

public class Converter {
    private static final float LITERS_IN_GALLON = 4.54609188f;
    private static final float KILOMETERS_IN_MILE = 1.609344f;
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.##");

    public static float toKiloPerLiter(float mpg) {
        return Float.parseFloat(DECIMAL_FORMAT.format(mpg * KILOMETERS_IN_MILE / LITERS_IN_GALLON));
    }
}

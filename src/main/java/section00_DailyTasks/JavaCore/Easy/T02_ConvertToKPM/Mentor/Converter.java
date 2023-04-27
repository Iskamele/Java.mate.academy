package section00_DailyTasks.JavaCore.Easy.T02_ConvertToKPM.Mentor;

public class Converter {
    private static final float LITER = 4.54609188f;
    private static final float KILOMETER = 1.609344f;

    public static float toKiloPerLiter(float mpg) {
        float out = (mpg * KILOMETER) / LITER;

        return (float) Math.round(out * 100) / 100;
    }
}

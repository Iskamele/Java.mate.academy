package section00_DailyTasks.JavaCore.Easy.T18_TipCalculator;

public class TipCalculator {
    public static Integer calculateTip(double amount, String rating) {
        switch (rating.toLowerCase()) {
            case "terrible":
                return 0;
            case "poor":
                return (int) Math.ceil(amount * 5 / 100);
            case "good":
                return (int) Math.ceil(amount * 10 / 100);
            case "great":
                return (int) Math.ceil(amount * 15 / 100);
            case "excellent":
                return (int) Math.ceil(amount * 20 / 100);
            default:
                return null;
        }
    }
}

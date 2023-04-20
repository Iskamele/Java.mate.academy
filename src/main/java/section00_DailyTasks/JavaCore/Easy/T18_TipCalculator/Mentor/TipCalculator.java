package section00_DailyTasks.JavaCore.Easy.T18_TipCalculator.Mentor;

public class TipCalculator {
    public static Integer calculateTip(double amount, String rating) {
        double tips;
        switch (rating.toLowerCase()) {
            case "terrible":
                tips = 0;
                break;
            case "poor":
                tips = amount * 0.05;
                break;
            case "good":
                tips = amount * 0.1;
                break;
            case "great":
                tips = amount * 0.15;
                break;
            case "excellent":
                tips = amount * 0.2;
                break;
            default:
                return null;
        }
        double result = Math.ceil(tips);
        return (int) result;
    }
}

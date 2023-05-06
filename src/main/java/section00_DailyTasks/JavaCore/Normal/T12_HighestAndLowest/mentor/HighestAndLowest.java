package section00_DailyTasks.JavaCore.Normal.T12_HighestAndLowest.mentor;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] nums = numbers.split(" ");

        for (String number : nums) {
            int num = Integer.parseInt(number);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return "" + max + " " + min;
    }
}

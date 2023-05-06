package section00_DailyTasks.JavaCore.Normal.T13_FormTheMinimumNumber.mentor;

public class MinimumValue {
    public static int getMinValue(int[] nums) {
        int result = 0;
        for (int i = 1; i <= 9; i++) {
            for (int num : nums) {
                if (num == i) {
                    result = result * 10 + num;
                    break;
                }
            }
        }
        return result;
    }
}

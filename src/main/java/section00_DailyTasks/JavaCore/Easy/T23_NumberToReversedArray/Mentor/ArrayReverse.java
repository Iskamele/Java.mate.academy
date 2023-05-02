package section00_DailyTasks.JavaCore.Easy.T23_NumberToReversedArray.Mentor;

public class ArrayReverse {
    public static int[] toReversedArray(long number) {
        String[] nums = new StringBuilder(String.valueOf(number)).reverse().toString().split("");
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = Integer.parseInt(nums[i]);
        }
        return result;
    }
}

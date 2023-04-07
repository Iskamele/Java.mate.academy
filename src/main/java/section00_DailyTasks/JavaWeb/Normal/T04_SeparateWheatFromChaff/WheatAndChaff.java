package section00_DailyTasks.JavaWeb.Normal.T04_SeparateWheatFromChaff;

public class WheatAndChaff {
    public static long[] separateWheatFromChaff(long[] nums) {
/*        return Arrays.stream(nums)
                .sorted()
                .toArray();*/
        for (int i = 0; i < nums.length; i++) {
            long temp = nums[i];
            if (nums[i] > 0) {
                for (int j = nums.length - 1; j > i; j--) {
                    if (nums[j] < 0) {
                        temp = nums[j];
                        nums[j] = nums[i];
                        break;
                    }
                }
                nums[i] = temp;
            }
        }
        return nums;
    }
}

package section00_DailyTasks.JavaCore.Normal.T19_SortGiftCode.mentor;

import java.util.Arrays;

public class GiftSorter {
    public static String sortGiftCode(String code) {
        char[] result = code.toCharArray();
        Arrays.sort(result);

        return new String(result);
    }
}

package section00_DailyTasks.JavaHibernate.Normal.T02_ConvertBinaryNumberInList;

public class BinaryNumberConverter {
    public static int getDecimalValue(ListNode head) {
        int result = 0;
        while (head != null) {
            result = (result << 1) + head.value;
            head = head.next;
        }
        return result;
    }
}

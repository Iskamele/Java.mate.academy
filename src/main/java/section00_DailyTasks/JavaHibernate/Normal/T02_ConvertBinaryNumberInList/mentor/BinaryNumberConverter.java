package section00_DailyTasks.JavaHibernate.Normal.T02_ConvertBinaryNumberInList.mentor;

import section00_DailyTasks.JavaHibernate.Normal.T02_ConvertBinaryNumberInList.ListNode;

public class BinaryNumberConverter {
    public static int getDecimalValue(ListNode head) {
        int result = head.value;
        while (head.next != null) {
            result = result * 2 + head.next.value;
            head = head.next;
        }
        return result;
    }
}

package Daily.JavaHibernate.Normal.T02_ConvertBinaryNumberInList;

import section00_DailyTasks.JavaHibernate.Normal.T02_ConvertBinaryNumberInList.BinaryNumberConverter;
import section00_DailyTasks.JavaHibernate.Normal.T02_ConvertBinaryNumberInList.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class BinaryNumberConverterTest {
    @Test
    public void getDecimalValue_ofZero() {
        ListNode head = new ListNode(0);
        int expected = 0;
        Assert.assertEquals("The decimal value should be 0 for the singly-linked list [0]\n",
                expected, BinaryNumberConverter.getDecimalValue(head));
    }

    @Test
    public void getDecimalValue_ofZeros() {
        ListNode head = new ListNode(0, new ListNode(0));
        int expected = 0;
        Assert.assertEquals("The decimal value should be 0 for the singly-linked list [0, 0]\n",
                expected, BinaryNumberConverter.getDecimalValue(head));
    }

    @Test
    public void getDecimalValue_ofOne() {
        ListNode head = new ListNode(1);
        int expected = 1;
        Assert.assertEquals("The decimal value should be 1 for the singly-linked list [1]\n",
                expected, BinaryNumberConverter.getDecimalValue(head));
    }

    @Test
    public void getDecimalValue_ofTwo() {
        ListNode head = new ListNode(1, new ListNode(0));
        int expected = 2;
        Assert.assertEquals("The decimal value should be 2 for the singly-linked list [1, 0]\n",
                expected, BinaryNumberConverter.getDecimalValue(head));
    }

    @Test
    public void getDecimalValue_ofFour() {
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(0)));
        int expected = 4;
        Assert.assertEquals("The decimal value should be 4 for the singly-linked list [1, 0, 0]\n",
                expected, BinaryNumberConverter.getDecimalValue(head));
    }

    @Test
    public void getDecimalValue_ofFive() {
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));
        int expected = 5;
        Assert.assertEquals("The decimal value should be 5 for the singly-linked list [1, 0, 1]\n",
                expected, BinaryNumberConverter.getDecimalValue(head));
    }

    @Test
    public void getDecimalValue_ofFifteen() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1))));
        int expected = 15;
        Assert.assertEquals("The decimal value should be 15 for the singly-linked list [1, 1, 1, 1]\n",
                expected, BinaryNumberConverter.getDecimalValue(head));
    }

    @Test
    public void getDecimalValue_ofBinary() {
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(0, new ListNode(1, new ListNode(0,
                new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(0, new ListNode(1))))))))));
        int expected = 605;
        Assert.assertEquals("The decimal value should be 605 for singly-linked list [1, 0, 0, 1, 0, 1, 1, 1, 0, 1]\n",
                expected, BinaryNumberConverter.getDecimalValue(head));
    }
}

package JavaCore.topic12_LinkedList.DeleteNode;

import org.junit.Assert;
import org.junit.Test;
import section04_JavaCore.topic12_LinkedList.practice.DeleteNode.DoublyLinkedList;
import section04_JavaCore.topic12_LinkedList.practice.DeleteNode.ListNode;

public class DoublyLinkedListTest {
  @Test
  public void deleteNode_threeIntegersList() {
    ListNode value1 = new ListNode(1);
    ListNode value2 = new ListNode(2);
    ListNode value3 = new ListNode(3);
    value1.next = value2;
    value2.prev = value1;
    value2.next = value3;
    value3.prev = value2;
    DoublyLinkedList.deleteNode(value2);
    Assert.assertEquals("The next value for 1 should be 3 if the head = [1, 2, 3] and node = 2\n",
      3, value1.next.value);
    Assert.assertEquals("\"The previous value for 3 should be 1 if the head = [1, 2, 3] and node = 2\n",
      1, value3.prev.value);
  }

  @Test
  public void deleteNode_listContainsZero() {
    ListNode value1 = new ListNode(7);
    ListNode value2 = new ListNode(0);
    ListNode value3 = new ListNode(5);
    value1.next = value2;
    value2.prev = value1;
    value2.next = value3;
    value3.prev = value2;
    DoublyLinkedList.deleteNode(value2);
    Assert.assertEquals("The next value for 7 should be 5 if the head = [7, 0, 5] and node = 0\n",
      5, value1.next.value);
    Assert.assertEquals("The previous value for 5 should be 7 if the head = [7, 0, 5] and node = 0\n",
      7, value3.prev.value);
  }

  @Test
  public void deleteNode_negativeIntegersList() {
    ListNode value1 = new ListNode(-12);
    ListNode value2 = new ListNode(-9);
    ListNode value3 = new ListNode(-697);
    value1.next = value2;
    value2.prev = value1;
    value2.next = value3;
    value3.prev = value2;
    DoublyLinkedList.deleteNode(value2);
    Assert.assertEquals("The next value for -12 should be -697 if the head = [-12, -9, -697] and node = -9\n",
      -697, value1.next.value);
    Assert.assertEquals("The previous value for -697 should be -12 if the head = [-12, -9, -697] and node = -9\n",
      -12, value3.prev.value);
  }

  @Test
  public void deleteNode_fourIntegersList() {
    ListNode value1 = new ListNode(-4);
    ListNode value2 = new ListNode(18);
    ListNode value3 = new ListNode(71);
    ListNode value4 = new ListNode(0);
    value1.next = value2;
    value2.prev = value1;
    value2.next = value3;
    value3.prev = value2;
    value3.next = value4;
    value4.prev = value3;
    DoublyLinkedList.deleteNode(value3);
    Assert.assertEquals("The next value for 18 should be 0 if the head = [-4, 18, 71, 0] and node = 71\n",
      0, value2.next.value);
    Assert.assertEquals("The previous value for 0 should be 18 if the head = [-4, 18, 71, 0] and node = 71\n",
      18, value4.prev.value);
  }

  @Test
  public void deleteNode_twoNodesDeleted() {
    ListNode value1 = new ListNode(11);
    ListNode value2 = new ListNode(-8);
    ListNode value3 = new ListNode(333);
    ListNode value4 = new ListNode(27);
    ListNode value5 = new ListNode(-65);
    value1.next = value2;
    value2.prev = value1;
    value2.next = value3;
    value3.prev = value2;
    value3.next = value4;
    value4.prev = value3;
    value4.next = value5;
    value5.prev = value4;
    DoublyLinkedList.deleteNode(value3);
    DoublyLinkedList.deleteNode(value4);
    Assert.assertEquals("The next value for -8 should be -65 if the head = [11, -8, 333, 27, -65] and nodes 333 and 27 are deleted\n",
      -65, value2.next.value);
    Assert.assertEquals("The previous value for -65 should be 8 if the head = [11, -8, 333, 27, -65] and nodes 333 and 27 are deleted\n",
      -8, value5.prev.value);
  }
}

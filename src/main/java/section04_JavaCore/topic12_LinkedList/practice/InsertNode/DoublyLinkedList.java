package section04_JavaCore.topic12_LinkedList.practice.InsertNode;

public class DoublyLinkedList {
    public static void insertNode(ListNode previous, ListNode newNode) {
        // [1, 3] prev 1, new node = 2

        // 2 ⇆ 1
        newNode.prev = previous;

        // 2 ⇆ 3
        newNode.next = previous.next;

        // 3 ⇆ 2
        // 3 !⇆ 1
        previous.next.prev = newNode;

        // 1 !⇆ 3
        previous.next = newNode;
    }
}

package section04_JavaCore.topic12_LinkedList.practice.DeleteNode;

public class DoublyLinkedList {
    public static void deleteNode(ListNode node) {
        // [1, 2, 3, 4, 5]
        // node 3

        // 2 ⇆ 4
        node.prev.next = node.next;

        // 4 ⇆ 2
        node.next.prev = node.prev;

        // 3 !⇆ 2
        // 3 !⇆ 4
        node.prev = null;
        node.next = null;
    }
}

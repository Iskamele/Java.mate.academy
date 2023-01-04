Definition for doubly-linked list in this task:

```
class ListNode {
    int value;
    ListNode prev;
    ListNode next;
       ListNode(int x) {
        value = x;
    }
}
```

Implement a method `insertNode()` to insert a node in a doubly-linked list. You will not be given access to the `head` of the list, instead you will be given the node `previous`, after which you should insert a new node, and the node `newNode` to be inserted.

It is guaranteed that the node to be inserted will not be at the beginning or at the end in the list and the value of each node in the list is unique.

Examples:
```
Input: head = [4, 9], previous = 4, newNode = 1
Output: [4, 1, 9]
Explanation: You are given the previous node with value 4 and a new node with value 1
the linked list should become 4 ⇆ 1 ⇆ 9 after calling your method
Input: head = [4, 1, 9], previous = 1, newNode = 5
Output: [4, 1, 5, 9]
Explanation: You are given the previous node with value 1 and a new node with value 5
the linked list should become 4 ⇆ 1 ⇆ 5 ⇆ 9 after calling your method
```
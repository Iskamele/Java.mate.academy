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

Implement a method `deleteNode()` to delete a node in a doubly-linked list. You will not be given access to the `head` of the list, instead you will be given access to the node to be deleted directly.

It is guaranteed that the node to be deleted is not a head or a tail node in the list and the value of each node in the list is unique.

Examples:
```
Input: head = [4, 5, 1, 9], node = 5
Output: [4, 1, 9]
Explanation: You are given the second node with value 5,
the linked list should become 4 ⇆ 1 ⇆ 9 after calling your method

Input: head = [4, 5, 1, 9], node = 1
Output: [4, 5, 9]
Explanation: You are given the third node with value 1,
the linked list should become 4 ⇆ 5 ⇆ 9 after calling your method

```
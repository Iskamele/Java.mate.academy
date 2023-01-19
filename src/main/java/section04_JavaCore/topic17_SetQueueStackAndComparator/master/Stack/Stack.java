package section04_JavaCore.topic17_SetQueueStackAndComparator.master.Stack;

import java.util.EmptyStackException;

public class Stack<T> {
  // field for storing last added element to the stack
  private Node<T> top;
  // field for storing the current number of elements in stack
  private int size;

  public void push(T value) {
    // variable for storing new element's value
    Node<T> newNode = new Node<>(value);
    /*
      set the current last element in the stack
      as the next element for the new one
    */
    newNode.next = top;
    // set a new element as the last one added to the stack
    top = newNode;
    // increment the current size of stack on 1
    size++;
  }

  public T peek() {
    // check if stack is empty
    if (size == 0) {
      // if stack is empty throw special exception for such case
      throw new EmptyStackException();
    }
    // return the value of last added to stack element
    return top.value;
  }

  public T pop() {
    // check if stack is empty
    if (size == 0) {
      // if stack is empty throw special exception for such case
      throw new EmptyStackException();
    }
    // variable for storing the value of last added to stack element
    T oldValue = top.value;
    /*
      set the current last element's next element
      as the last added element to the stack
    */
    top = top.next;
    // decrement the current size of stack on 1
    size--;
    // return the value of removed element
    return oldValue;
  }

  public int size() {
    // return the current size of stack
    return size;
  }

  /*
    create inner static class Node,
    whose objects will be storing value of element
    and link to the next element
  */
  private static class Node<T> {
    private final T value;
    private Node<T> next;

    private Node(T value) {
      this.value = value;
    }
  }
}

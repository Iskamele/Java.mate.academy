package section04_JavaCore.topic17_SetQueueStackAndComparator.practice.Stack.AfterMaster;


import java.util.EmptyStackException;

@SuppressWarnings("unchecked") // do not remove this line
public class Stack<T> {
    private int size;
    private Node<T> top;

    public Stack() {
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.item;
    }

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        Node<T> oldValue = top;
        top = oldValue.next;
        size--;
        return oldValue.item;
    }

    public int size() {
        return size;
    }

    private static class Node<T> {
        private final T item;
        private Node<T> next;

        Node(T item) {
            this.item = item;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Stack: " + "size: " + size);
        if (top == null) {
            return stringBuilder.toString();
        }
        Node<T> node = top;
        int i = 0;
        while (i < size) {
            stringBuilder
                    .append(", ")
                    .append(node.item);
            node = node.next;
            i++;
        }
        return stringBuilder.toString();
    }
}

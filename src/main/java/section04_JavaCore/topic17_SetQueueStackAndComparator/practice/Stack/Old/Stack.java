package section04_JavaCore.topic17_SetQueueStackAndComparator.practice.Stack.Old;


import java.util.EmptyStackException;

@SuppressWarnings("unchecked") // do not remove this line
public class Stack<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    public Stack() {
    }

    public void push(T value) {
        Node<T> node = last;
        Node<T> newNode = new Node<>(value);
        last = newNode;
        if (node == null) {
            first = newNode;
        } else {
            newNode.prev = node;
        }
        size++;
    }

    public T peek() {
        if (last == null) {
            throw new EmptyStackException();
        }
        return last.item;
    }

    public T pop() {
        if (last == null) {
            throw new EmptyStackException();
        }
        Node<T> node = last;
        last = node.prev;
        size--;
        return node.item;
    }

    public int size() {
        return size;
    }

    private static class Node<T> {
        private final T item;
        private Node<T> prev;

        Node(T item) {
            this.item = item;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Stack: " + "size: " + size);
        if (last == null) {
            return stringBuilder.toString();
        }
        Node<T> node = last;
        int i = 0;
        while (i < size) {
            stringBuilder
                    .append(", ")
                    .append(node.item);
            node = node.prev;
            i++;
        }
        return stringBuilder.toString();
    }
}

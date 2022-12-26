package section04_JavaCore.topic12_LinkedList.theory.T02_ClassNode;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public void add(T value) {
        //new Node<>(prev, value, next);
    }

    class Node<T> {
        T value;
        Main.Node<T> prev;
        Main.Node<T> next;

        public Node(Main.Node<T> prev, T value, Main.Node<T> next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }
}

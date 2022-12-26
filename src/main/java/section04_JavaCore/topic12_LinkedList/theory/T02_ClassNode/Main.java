package section04_JavaCore.topic12_LinkedList.theory.T02_ClassNode;

public class Main {
    public static void main(String[] args) {
        // LinkedList. Node

        Node<Integer> node1 = new Node<>(null, 10, null);
        Node<Integer> node2 = new Node<>(node1, 20, null);
        node1.next = node2;
        Node<Integer> node3 = new Node<>(node2, 30, null);
        node2.next = node3;

        Node<Integer> currentNode = node1;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    static class Node<T>{
        T value;
        Node<T> prev;
        Node<T> next;

        public Node(Node<T> prev, T value, Node<T> next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }
}

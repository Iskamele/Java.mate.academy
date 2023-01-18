package section04_JavaCore.topic17_SetQueueStackAndComparator.theory.T05_Deque;

import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // Deque example

        Deque<String> clients = new LinkedList<>();
        clients.add("Bob");
        clients.add("Alice");
        clients.add("John");
        System.out.println(clients);

        System.out.println("POLL FIRST");
        System.out.println(clients.pollFirst());
        System.out.println(clients);
        System.out.println();

        System.out.println("POLL LAST");
        System.out.println(clients.pollLast());
        System.out.println(clients);
        System.out.println();

        clients.add("Bob");
        clients.add("John");
        System.out.println(clients);
        System.out.println("REMOVE LAST");
        // В отличии от pollLast если мы в removeLast передадим пустой массив, вылетит ошибка
        System.out.println(clients.removeLast());
        System.out.println(clients);
        System.out.println();
    }
}

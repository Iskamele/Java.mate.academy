package section04_JavaCore.topic17_SetQueueStackAndComparator.theory.T04_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        // Queue

        Queue<String> buyers = new LinkedList<>();
        buyers.add("Bob");
        buyers.add("Alice");
        buyers.add("John");
        buyers.add("Bill");
        System.out.println(buyers);
        System.out.println();

        System.out.println("OFFER");
        buyers.offer("Bruce");
        System.out.println(buyers);
        System.out.println();

        System.out.println("PEEK");
        System.out.println(buyers.peek());
        System.out.println(buyers);
        System.out.println();

        System.out.println("POLL");
        System.out.println(buyers.poll());
        System.out.println(buyers.poll());
        System.out.println(buyers.poll());
        System.out.println(buyers);
        System.out.println();

    }
}

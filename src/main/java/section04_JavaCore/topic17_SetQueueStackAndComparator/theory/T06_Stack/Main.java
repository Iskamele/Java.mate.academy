package section04_JavaCore.topic17_SetQueueStackAndComparator.theory.T06_Stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // Stack

        Stack<String> plates = new Stack<>();
        plates.add("plate 1");
        plates.add("plate 2");
        plates.add("plate 3");
        plates.add("plate 4");

        // Разница между add и push
        plates.add(1, "plate 5");
        plates.push("plate 6");
        System.out.println(plates);
        System.out.println();

        System.out.println("PEEK");
        System.out.println(plates.peek());
        System.out.println(plates.peek());
        System.out.println(plates.peek());
        System.out.println(plates);
        System.out.println();

        System.out.println("POP");
        System.out.println(plates.pop());
        System.out.println(plates.pop());
        System.out.println(plates.pop());
        System.out.println(plates);
        System.out.println();
    }
}

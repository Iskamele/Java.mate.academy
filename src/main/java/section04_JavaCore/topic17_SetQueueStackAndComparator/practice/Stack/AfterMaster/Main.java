package section04_JavaCore.topic17_SetQueueStackAndComparator.practice.Stack.AfterMaster;

public class Main {

    public static void main(String[] args) {
        Stack<String> plates = new Stack<>();
        plates.push("HELLO");
        plates.push("WORLD");
        plates.push("MATE");
        System.out.println(plates.toString());
        System.out.println();

        System.out.println("PEEK");
        System.out.println(plates.peek());
        System.out.println(plates.peek());
        System.out.println(plates.peek());
        System.out.println(plates.toString());
        System.out.println();

        System.out.println("POP");
        System.out.println(plates.pop());
        System.out.println(plates.pop());
        System.out.println(plates.pop());
        System.out.println(plates.toString());
        System.out.println();
    }
}

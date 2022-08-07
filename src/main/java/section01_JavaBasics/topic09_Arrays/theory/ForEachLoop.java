package section01_JavaBasics.topic09_Arrays.theory;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "John"};

        for (String name: names){
            System.out.println("Name = " + name);
        }
    }
}
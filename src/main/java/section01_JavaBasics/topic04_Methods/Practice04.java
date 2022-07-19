package section01_JavaBasics.topic04_Methods;

public class Practice04 {
    public static void main(String[] args) {
        greet("Bob");
        greet("John");
    }

    public static String greet (String name){
        return "Hello " + name;
    }
}

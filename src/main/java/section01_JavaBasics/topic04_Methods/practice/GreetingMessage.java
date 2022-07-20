package section01_JavaBasics.topic04_Methods.practice;

public class GreetingMessage {
    public static void main(String[] args) {
        System.out.println(greet("Alex"));
    }
    public static String greet (String name){
        return "Hello " + name;
    }
}

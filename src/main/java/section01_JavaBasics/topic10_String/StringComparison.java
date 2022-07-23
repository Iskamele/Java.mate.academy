package section01_JavaBasics.topic10_String;

public class StringComparison {
    public static void main(String[] args) {
// How to compare String objects?

        String a = "a";
        String b = new String("a");
        // Создаёт ссылку на первый объект в памяти "a"
        String c = "a";

        System.out.println(a == c);
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}

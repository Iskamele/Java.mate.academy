package section01_JavaBasics.topic10_String;

public class IsEmptySubstring {
    public static void main(String[] args) {
        String s = "a";
        boolean isEmpty = s.isEmpty();
        System.out.println(isEmpty);

        String s2 = "";
        boolean isEmpty2 = s2.isEmpty();
        System.out.println(isEmpty2);

        String str = "hello world";
        String substring = str.substring(5, 8);
        System.out.println(substring);
    }
}

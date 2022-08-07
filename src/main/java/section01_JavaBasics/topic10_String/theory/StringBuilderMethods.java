package section01_JavaBasics.topic10_String.theory;

public class StringBuilderMethods {
    public static void main(String[] args) {
        // String concatenation vs StringBuilder

        // concatenation
        // Этот способ будет хранить в памяти все шаги конкатенации
        // Это неоптимизированный способ
        String result = "hello " + "world" + 15 + " " + 2.12;
        System.out.println(result);

        // StringBuilder
        // Более оптимизированный способ
        StringBuilder builder = new StringBuilder();
        builder.append("Hello ")
                .append("world ")
                .append(31);
        String string = builder.toString();
        System.out.println(string);

        // Reverse
        StringBuilder reverse = builder.reverse();
        String reversedString = reverse.toString();
        System.out.println(reversedString);

    }
}

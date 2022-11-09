package section04_JavaCore.topic06_Exceptions.T10_WhatIsStacktrace;

public class Main {
    public static void main(String[] args) {
        // stacktrace
        // a stack trace is a list of the method calls that the application
        // was in the middle of when on Exception was thrown
        print();
    }

    private static void print() {
        String[] data = {"hello", "world"};
        System.out.println(getMessage(data));
        String[] emptyData = {}; // нельзя передавать пустой массив, здесь возникает ошибка
        System.out.println(getMessage(emptyData));
    }

    private static String getMessage(String[] data) {
        return getConcatenatedWords(data);
    }

    private static String getConcatenatedWords(String[] words) {
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(word).append(" - ");
        }
        String message = builder.toString();
        String trimmed = message.substring(0, message.length() - 3);
        return trimmed;
    }
}

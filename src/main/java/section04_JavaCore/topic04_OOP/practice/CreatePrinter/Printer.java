package section04_JavaCore.topic04_OOP.practice.CreatePrinter;

class Printer {
    public static void main(String[] args) {
        String[] array = {"I", "print", "words", "from", "an", "array"};

        System.out.println(print("Hello!"));
        System.out.println(print("123"));
        System.out.println(print("3.14"));
        System.out.println(print("seven", 11));
        System.out.println(print(array));

    }

    public static String print(String message) {
        return message;
    }

    public static String print(int number) {
        return String.valueOf(number);
    }

    public static String print(double number) {
        return String.valueOf(number);
    }

    public static String print(String message, int number) {
        return message + " and " + number;
    }

    //public static String print(String[] array) {
    //    return Arrays.toString(array);
    //}

    public static String print(String[] array) {
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for (int i = 0; i <= array.length - 1; i++) {
            builder.append(array[i]);
            if (array.length - 1 == i) {
                break;
            } else {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
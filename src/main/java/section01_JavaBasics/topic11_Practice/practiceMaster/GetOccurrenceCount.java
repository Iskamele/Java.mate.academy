package section01_JavaBasics.topic11_Practice.practiceMaster;

public class GetOccurrenceCount {
    public static void main(String[] args) {
        System.out.println(getOccurrenceCount(new String[]{"blue", "blue", "blue"}, "blue")); // 3
        System.out.println(getOccurrenceCount(new String[]{"blue", "green", "red"}, "red")); // 1
        System.out.println(getOccurrenceCount(new String[]{"blue", "green", "red"}, "white")); // 0
        System.out.println(getOccurrenceCount(new String[]{"blue", "green", "red"}, null)); // 0
        System.out.println(getOccurrenceCount(new String[0], "blue")); // 0
    }

    public static int getOccurrenceCount(String[] colors, String targetColor) {
        // declare variable to store intermidiate result
        int count = 0;

        for (String color : colors) {
            // If current color is the same as targetColor increase count value by 1
            // String variables should be compared by .equals() instead of ==
            if (color.equals(targetColor)) {
                count++;
            }
        }
        return count;
    }
}
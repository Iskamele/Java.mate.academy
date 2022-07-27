package section01_JavaBasics.topic11_Practice;

public class GetOccurrenceCount {
    public static void main(String[] args) {
        System.out.println(getOccurrenceCount(new String[]{"blue", "blue", "blue"}, "blue")); // 3
        System.out.println(getOccurrenceCount(new String[]{"blue", "green", "red"}, "red")); // 1
        System.out.println(getOccurrenceCount(new String[]{"blue", "green", "red"}, "white")); // 0
        System.out.println(getOccurrenceCount(new String[]{"blue", "green", "red"}, null)); // 0
        System.out.println(getOccurrenceCount(new String[0], "blue")); // 0
    }

    public static int getOccurrenceCount(String[] colors, String targetColor) {
        int count = 0;
        for (String color : colors){
            if (color.equals(targetColor)){
                count++;
            }
        }
        return count;
    }
}
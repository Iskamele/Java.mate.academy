package section01_JavaBasics.topic11_Practice;

public class GetMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddleString("hello"));
        System.out.println(getMiddleString("1234"));
        System.out.println(getMiddleString("(())"));
        System.out.println(getMiddleString("Bob"));
        System.out.println(getMiddleString(""));
    }
    public static String getMiddleString(String originalString) {
        if (originalString.equals("")){
            return "";
        }

        char[] array = originalString.toCharArray();
        StringBuilder builder = new StringBuilder();
        builder.append(array[originalString.length()/2]);
        if (originalString.length() % 2 == 0){
            builder.insert(0, array[originalString.length() / 2 - 1]);
        }
        return builder.toString();
    }
}
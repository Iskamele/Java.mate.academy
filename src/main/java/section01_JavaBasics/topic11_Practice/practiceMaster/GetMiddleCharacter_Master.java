package section01_JavaBasics.topic11_Practice.practiceMaster;

public class GetMiddleCharacter_Master {
    public static void main(String[] args) {
        System.out.println(getMiddleString("hello"));
        System.out.println(getMiddleString("1234"));
        System.out.println(getMiddleString("(())"));
        System.out.println(getMiddleString("Bob"));
        System.out.println(getMiddleString(""));
    }

    public static String getMiddleString(String originalString) {
        int stringLength = originalString.length();

    /*
        for empty string input we can just return "", if we try access elements by index
        we will get error - IndexOutOfBoundException
     */
        if (stringLength == 0) {
            return "";
        }

        int middleIndex = stringLength / 2;

    /*
       if input length is odd we need to return 1 symbol, if even 2
       - odd: return originalString.substring(middleIndex, middleIndex + 1);
       - even: return originalString.substring(middleIndex - 1, middleIndex + 1);
     */
        return stringLength % 2 == 1 ? originalString.substring(middleIndex, middleIndex + 1)
                : originalString.substring(middleIndex - 1, middleIndex + 1);
    }
}
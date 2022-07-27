package section01_JavaBasics.topic10_String.practiceMaster;

public class CompareStrings {

    public static void main(String[] args) {
        System.out.println(compareStrings("java rocks!", "java rocks!"));
        System.out.println(compareStrings("party", "Party"));
        System.out.println(compareStrings(null, null));
        System.out.println(compareStrings(null, "Party"));
        System.out.println(compareStrings("Party", null));
    }

    public static boolean compareStrings(String firstString, String secondString) {
        if (firstString == null && secondString == null) {
            return true;
        }
        return firstString != null && firstString.equals(secondString);
    }
}
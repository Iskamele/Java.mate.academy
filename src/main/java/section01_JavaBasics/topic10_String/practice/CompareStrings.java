package section01_JavaBasics.topic10_String.practice;

public class CompareStrings {
    public static void main(String[] args) {
        System.out.println(compareStrings("java rocks!", "java rocks!"));
        System.out.println(compareStrings("party", "Party"));
        System.out.println(compareStrings(null, null));
        System.out.println(compareStrings(null, "Party"));
    }

    public static boolean compareStrings(String firstString, String secondString) {
        if (firstString == null && secondString == null){
            return true;
        } else if (firstString != null && secondString != null){
            return firstString.equals(secondString);
        }
        return false;
    }
}

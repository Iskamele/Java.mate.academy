package section01_JavaBasics.topic10_String.practiceMaster;

public class MakeAbbr {
    public static void main(String[] args) {
        System.out.println(makeAbbr("national aeronautics space administration"));
        System.out.println(makeAbbr("central processing unit"));
        System.out.println(makeAbbr("simplified molecular input line entry specification"));
    }

    public static String makeAbbr(String fullName) {
        String[] words = fullName.split(" ");
        StringBuilder builder = new StringBuilder();

        for (String word : words) {
            builder.append(String.valueOf(word.charAt(0)).toUpperCase());
        }
        return builder.toString();
    }
}
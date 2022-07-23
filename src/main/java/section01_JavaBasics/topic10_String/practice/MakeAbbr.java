package section01_JavaBasics.topic10_String.practice;

public class MakeAbbr {
    public static void main(String[] args) {
        System.out.println(makeAbbr("national aeronautics space administration"));
        System.out.println(makeAbbr("central processing unit"));
        System.out.println(makeAbbr("simplified molecular input line entry specification"));
    }

    public static String makeAbbr(String fullName) {

        StringBuilder abbr = new StringBuilder();
        String[] array = fullName.split(" ");

        for (String word : array){
            abbr.append(word.charAt(0));
        }
        String answer = abbr.toString();

        return answer.toUpperCase();
    }
}
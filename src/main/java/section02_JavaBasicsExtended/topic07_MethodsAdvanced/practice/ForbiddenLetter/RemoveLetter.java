package section02_JavaBasicsExtended.topic07_MethodsAdvanced.practice.ForbiddenLetter;

public class RemoveLetter {
    public static char[] removeLetter(String input) {
        if (input == null) {
            return new char[0];
        }
        char[] letters = input.toLowerCase().toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'r') {
                letters[i] = '!';
            }
        }
        return letters;
    }
}

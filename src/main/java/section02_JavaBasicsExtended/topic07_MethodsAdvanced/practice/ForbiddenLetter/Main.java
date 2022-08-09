package section02_JavaBasicsExtended.topic07_MethodsAdvanced.practice.ForbiddenLetter;

import static section02_JavaBasicsExtended.topic07_MethodsAdvanced.practice.ForbiddenLetter.RemoveLetter.removeLetter;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeLetter(""));
        System.out.println(removeLetter("Hello world"));
        System.out.println(removeLetter("welcomeRRR"));
        System.out.println(removeLetter("rrRrR"));
        System.out.println(removeLetter("Remove Letters"));
    }
}

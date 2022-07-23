package section01_JavaBasics.topic10_String.practice;

public class CorruptedData {
    public static void main(String[] args) {
        System.out.println(getValue("name=joHN"));
        System.out.println(getValue("occupation=DeveLOPeR"));
        System.out.println(getValue("language=JAVA"));
        System.out.println(getValue("login=Me=cOol!!1"));
    }
    public static String getValue(String dataFromDatabase) {
        int indexOf = dataFromDatabase.indexOf('=');
        String answer = dataFromDatabase.substring(indexOf + 1).toLowerCase(); //
        return answer;
    }
}
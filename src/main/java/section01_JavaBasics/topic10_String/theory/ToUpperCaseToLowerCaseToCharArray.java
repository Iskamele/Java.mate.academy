package section01_JavaBasics.topic10_String.theory;

public class ToUpperCaseToLowerCaseToCharArray {
    public static void main(String[] args) {
        String name = "Bob";
        String name2 = new String("Boo");

        char[] chars = name.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        chars[0] = 'b';
        String newName = new String(chars);
        System.out.println(newName);

        String upperCaseName = newName.toUpperCase();
        System.out.println(upperCaseName);

        String name3 = "Alice";
        String lowerCaseName = name3.toLowerCase();
        System.out.println(lowerCaseName);
    }

}

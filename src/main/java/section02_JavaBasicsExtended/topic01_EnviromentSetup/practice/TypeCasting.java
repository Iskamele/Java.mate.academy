package section02_JavaBasicsExtended.topic01_EnviromentSetup.practice;

public class TypeCasting {
    public static void main(String[] args) {
        short s = 30;
        long l = 14;
        declareCastedVariables(s, l);
    }

    public static void declareCastedVariables(short s, long l) {
        int shortInt = s;
        int longInt = (int) l;

        System.out.println(shortInt + " " + longInt);
    }
}

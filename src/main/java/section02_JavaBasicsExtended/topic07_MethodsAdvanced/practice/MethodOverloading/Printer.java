package section02_JavaBasicsExtended.topic07_MethodsAdvanced.practice.MethodOverloading;

public class Printer {
    public void printArguments(String stringArg) {
        System.out.println("1th String argument is " + stringArg);
    }

    public void printArguments(int argument) {
        System.out.println("2th int argument is " + argument);
    }

    public void printArguments(boolean argument) {
        System.out.println("3th boolean argument is " + argument);
    }

    public void printArguments(String firstArgument, String secondArgument) {
        System.out.println("4th Strings arguments is " + firstArgument + " and " + secondArgument);
    }
}

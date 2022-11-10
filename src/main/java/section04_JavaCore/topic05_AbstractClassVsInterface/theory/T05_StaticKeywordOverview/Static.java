package section04_JavaCore.topic05_AbstractClassVsInterface.theory.T05_StaticKeywordOverview;

public class Static {
    public static void main(String[] args) {
        // static keyword
        sayHello();

        Static aStatic = new Static();
        aStatic.sayNonStatic();
    }
    public static void sayHello(){
        System.out.println("Hello mates!");
    }

    public void sayNonStatic(){
        System.out.println("I am not static");
        sayHello();
    }
}

package section01_JavaBasics.topic08_Loops;

public class Break {
    public static void main(String[] args) {
        int i = 0;
        while (true){
            i++;
            System.out.println(i);

            // break;
            if (i >= 3){
                break;
            }
        }
    }
}

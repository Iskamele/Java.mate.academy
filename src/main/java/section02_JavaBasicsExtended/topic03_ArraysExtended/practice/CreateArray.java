package section02_JavaBasicsExtended.topic03_ArraysExtended.practice;

public class CreateArray {
    public static void main(String[] args) {
        char[][] sosSignal = new char[3][3];
        sosSignal[1][0] = 'S';
        sosSignal[1][1] = 'O';
        sosSignal[1][2] = 'S';

        for (int i = 0; i < sosSignal.length; i++){
            sosSignal[0][i] = 'x';
            sosSignal[2][i] = 'x';
        }
    }
}

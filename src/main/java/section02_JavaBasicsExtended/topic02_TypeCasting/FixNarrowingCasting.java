package section02_JavaBasicsExtended.topic02_TypeCasting;

public class FixNarrowingCasting {
    public static void main(String[] args) {
        System.out.println(casteDoubleToInt(10.10));
    }
    public static int casteDoubleToInt(double value) {
        return (int) value;
    }
}

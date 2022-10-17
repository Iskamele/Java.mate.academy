package section04_JavaCore.topic04_OOP.theory.Thirteenth_GetRandomEnumValue;

public class Main {

    public static void main(String[] args) {
        DayOfWeekSupplier supplier = new DayOfWeekSupplier();
        for (int i = 0; i < 10; i++) {
            System.out.println(supplier.getRandomDayOfWeek());
        }
    }
}

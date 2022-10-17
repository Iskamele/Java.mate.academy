package section04_JavaCore.topic04_OOP.theory.Thirteenth_GetRandomEnumValue;

import java.util.Random;

public class DayOfWeekSupplier {
    public DayOfWeek getRandomDayOfWeek() {
        int index = new Random().nextInt(DayOfWeek.values().length);
        return DayOfWeek.values()[index];
    }
}

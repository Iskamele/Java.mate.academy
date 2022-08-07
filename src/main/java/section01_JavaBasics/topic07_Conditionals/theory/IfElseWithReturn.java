package section01_JavaBasics.topic07_Conditionals.theory;

public class IfElseWithReturn {
    public static void main(String[] args) {
        int shortTermCost = 50; // days 1-3
        int weekCost = 40; // days 4-7
        int longTermCost = 30; // days 8-...

        int twoDaysCost = getRentalPrice(2); // 2 * 50 = 100
        int fiveDaysCost = getRentalPrice(5); // 3 * 50 + 2 * 40 = 230
        int tenDaysCost = getRentalPrice(10); // 3 * 50 + 4 * 40 + 3 * 30 = 400

        System.out.println(twoDaysCost);
        System.out.println(fiveDaysCost);
        System.out.println(tenDaysCost);
    }

    public static int getRentalPrice(int numberOfDays) {
        if (numberOfDays <= 3) {
            return numberOfDays * 50;
        }
        int daysLeft = numberOfDays - 3;

        if (daysLeft <= 4) {
            return 3 * 50 + daysLeft * 40;
        }
        daysLeft = numberOfDays - 7;
        return 3 * 50 + 4 * 40 + daysLeft * 30;
    }

    /*
    public static int getRentalPrice(int numberOfDays) {
        if (numberOfDays <= 3) {
            return numberOfDays * 50;
        } else {
            int daysLeft = numberOfDays - 3;

            if (daysLeft <= 4) {
                return 3 * 50 + daysLeft * 40;
            }
            else {
                daysLeft = numberOfDays - 7;
                return 3 * 50 + 4 * 40 + daysLeft * 30;
            }
        }
    }
     */
}

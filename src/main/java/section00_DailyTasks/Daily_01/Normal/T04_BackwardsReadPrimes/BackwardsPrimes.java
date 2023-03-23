package section00_DailyTasks.Daily_01.Normal.T04_BackwardsReadPrimes;

import java.util.stream.IntStream;

public class BackwardsPrimes {
    public static String getBackwardsPrimes(long start, long end) {
        StringBuilder builder = new StringBuilder();
        if (start < 13) {
            start = 13;
        }
        if (start % 2 == 0) {
            start--;
        }
        for (long number = start; number <= end; number++) {
            if (isPrime(number)) {
                if (isPrime(reverseNumber(number))) {
                    builder.append(number);
                    builder.append(" ");
                }
            }
        }
        return builder.toString().trim();
    }

    private static long reverseNumber(long number) {
        long reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }
        return reverse;
    }

    private static boolean isPrime(long number) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(i -> number % i == 0);
        //return BigInteger.valueOf(number).isProbablePrime((int) Math.log(number));
    }
}

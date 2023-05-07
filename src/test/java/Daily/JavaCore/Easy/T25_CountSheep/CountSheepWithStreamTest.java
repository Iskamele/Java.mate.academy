package Daily.JavaCore.Easy.T25_CountSheep;

import section00_DailyTasks.JavaCore.Easy.T25_CountSheep.CountSheepWithStream;
import java.util.Random;
import org.junit.Assert;
import org.junit.Test;

public class CountSheepWithStreamTest {
    @Test
    public void countSheep_CountOneSheep() {
        Assert.assertEquals("Your method should return a murmur with 1 sheep\n",
                "1 sheep...", CountSheepWithStream.countSheep(1));
    }

    @Test
    public void countSheep_CountTwoSheep() {
        Assert.assertEquals("Your method should return a murmur with 2 sheep\n",
                "1 sheep...2 sheep...", CountSheepWithStream.countSheep(2));
    }

    @Test
    public void countSheep_CountThreeSheep() {
        Assert.assertEquals("Your method should return a murmur with 3 sheep\n",
                "1 sheep...2 sheep...3 sheep...", CountSheepWithStream.countSheep(3));
    }

    @Test
    public void countSheep_CountZeroSheep() {
        Assert.assertEquals("Your method should return an empty string for zero sheep\n",
                "", CountSheepWithStream.countSheep(0));
    }

    @Test
    public void countSheep_CountRandomSheep() {
        Random random = new Random();
        int randomNum = 4 + random.nextInt(10);
        String expected = countingSheep(randomNum);
        Assert.assertEquals("Your method should return a murmur for a random number of sheep\n",
                expected, CountSheepWithStream.countSheep(randomNum));
    }

    private static String countingSheep(int num) {
        StringBuilder murmur = new StringBuilder();
        for (int i = 1; i < num + 1; i++) {
            murmur.append(i).append(" sheep...");
        }
        return murmur.toString();
    }
}

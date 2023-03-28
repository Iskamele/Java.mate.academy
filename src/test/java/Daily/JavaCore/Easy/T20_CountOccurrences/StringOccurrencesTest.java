package Daily.JavaCore.Easy.T20_CountOccurrences;

import section00_DailyTasks.JavaCore.Easy.T20_CountOccurrences.StringOccurrences;
import org.junit.Assert;
import org.junit.Test;

public class StringOccurrencesTest {
    @Test
    public void countOccurrences_emptyString() {
        String string = "";
        char letter = 'a';
        int actual = StringOccurrences.countOccurrences(string, letter);
        Assert.assertEquals(String.format("The result should be %d for the string \"%s\" and the letter \"%s\"\n",
                0, string, letter), 0, actual);
    }

    @Test
    public void countOccurrences_zeroOccurrences() {
        String string = "aloha";
        char letter = 'y';
        int actual = StringOccurrences.countOccurrences(string, letter);
        Assert.assertEquals(String.format("The result should be %d for the string \"%s\" and the letter \"%s\"\n",
                0, string, letter), 0, actual);
    }

    @Test
    public void countOccurrences_oneOccurrence() {
        String string = "mate";
        char letter = 't';
        int actual = StringOccurrences.countOccurrences(string, letter);
        Assert.assertEquals(String.format("The result should be %d for the string \"%s\" and the letter \"%s\"\n",
                1, string, letter), 1, actual);
    }

    @Test
    public void countOccurrences_twoOccurrences() {
        String string = "coffee";
        char letter = 'e';
        int actual = StringOccurrences.countOccurrences(string, letter);
        Assert.assertEquals(String.format("The result should be %d for the string \"%s\" and the letter \"%s\"\n",
                2, string, letter), 2, actual);
    }

    @Test
    public void countOccurrences_threeOccurrences() {
        String string = "brrr";
        char letter = 'r';
        int actual = StringOccurrences.countOccurrences(string, letter);
        Assert.assertEquals(String.format("The result should be %d for the string \"%s\" and the letter \"%s\"\n",
                3, string, letter), 3, actual);
    }

    @Test
    public void countOccurrences_uppercaseOccurrences() {
        String string = "MIMEMAMEN";
        char letter = 'M';
        int actual = StringOccurrences.countOccurrences(string, letter);
        Assert.assertEquals(String.format("The result should be %d for the string \"%s\" and the letter \"%s\"\n",
                4, string, letter), 4, actual);
    }
}

package Daily.JavaCore.Normal.T05_RemoveAllVowels;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Normal.T05_RemoveAllVowels.Vowels;

public class VowelsTest {
    private static final Map<String, String> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put("Chicken", "Chckn");
        data.put("aaa", "");
        data.put("This website is for losers LOL!", "Ths wbst s fr lsrs LL!");
        data.put("What are you, a communist?", "Wht r y,  cmmnst?");
        data.put("No offense but,\nYour writing is among the worst I've ever read",
                "N ffns bt,\nYr wrtng s mng th wrst 'v vr rd");
    }

    @Test
    public void removeVowel_stringWithVowels() {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String input = entry.getKey();
            String expected = entry.getValue();
            String actual = Vowels.removeVowel(input);
            Assert.assertEquals(String.format("The result should be \"%s\" for the input string \"%s\"\n",
                    expected, input), expected, actual);
        }
    }

    @Test
    public void removeVowels_noVowelsInString() {
        String input = "grrrl";
        String expected = "grrrl";
        String actual = Vowels.removeVowel(input);
        Assert.assertEquals(String.format("The result should be the same as input if there are no vowels in string \"%s\"\n",
                input), expected, actual);
    }
}

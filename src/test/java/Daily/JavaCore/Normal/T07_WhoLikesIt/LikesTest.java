package Daily.JavaCore.Normal.T07_WhoLikesIt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import section00_DailyTasks.JavaCore.Normal.T07_WhoLikesIt.Likes;

public class LikesTest {
    private static final Map<String[], String> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put(new String[]{}, "No one likes this");
        data.put(new String[]{"Sherlock"}, "Sherlock likes this");
        data.put(new String[]{"Moriarty"}, "Moriarty likes this");
        data.put(new String[]{"Rick", "Morty"}, "Rick and Morty like this");
        data.put(new String[]{"Romeo", "Juliette"}, "Romeo and Juliette like this");
        data.put(new String[]{"Edgar", "Allan", "Poe"}, "Edgar, Allan and Poe like this");
        data.put(new String[]{"Erich", "Maria", "Remarque"}, "Erich, Maria and Remarque like this");
        data.put(new String[]{"Frodo", "Gandalf", "Saruman", "Gollum"}, "Frodo, Gandalf and 2 others like this");
        data.put(new String[]{"Grumpy", "Dopey", "Doc", "Happy", "Bashful", "Sneezy", "Sleepy"}, "Grumpy, Dopey and 5 others like this");
    }

    @Test
    public void whoLikesIt_namesArray() {
        for (Map.Entry<String[], String> entry : data.entrySet()) {
            String[] input = entry.getKey();
            String expected = entry.getValue();
            String actual = Likes.whoLikesIt(input);
            Assert.assertEquals(String.format("Your method should return %s for the array \"%s\"",
                    expected, Arrays.toString(input)), expected, actual);
        }
    }
}

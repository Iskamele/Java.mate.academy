package Daily.JavaJDBC.Easy.T09_GetCharacterAtPosition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaJDBC.Easy.T09_GetCharacterAtPosition.WordLists;

public class WordListsTest {
    private static final String NEW_LIST_REGEX = ".*if.*|.*for.*|.*while.*|.*newArrayList.*|.*newLinkedList.*";
    private static String resultCode;

//  @BeforeClass
//  public static void setUp() {
//    resultCode = Solution.getSolution().replaceAll("\\s", "");
//  }

    @Test
    public void getCharacterAtPosition_emptyList() {
        List<String> strings = Collections.emptyList();
        int position = 3;
        List<Character> expected = Collections.emptyList();
        List<Character> actual = WordLists.getCharacterAtPosition(strings, position);
        Assert.assertEquals(String.format("The result should be \"%s\" for the input list \"%s\" and position %d\n",
                expected, strings, position), expected, actual);
    }

    @Test
    public void getCharacterAtPosition_oneWord() {
        List<String> strings = List.of("Hello");
        int position = 1;
        List<Character> expected = List.of('e');
        List<Character> actual = WordLists.getCharacterAtPosition(strings, position);
        Assert.assertEquals(String.format("The result should be \"%s\" for the input list \"%s\" and position %d\n",
                expected, strings, position), expected, actual);
    }

    @Test
    public void getCharacterAtPosition_twoWords() {
        List<String> strings = List.of("Hello", "WORLD");
        int position = 2;
        List<Character> expected = List.of('l', 'r');
        List<Character> actual = WordLists.getCharacterAtPosition(strings, position);
        Assert.assertEquals(String.format("The result should be \"%s\" for the input list \"%s\" and position %d\n",
                expected, strings, position), expected, actual);
    }

    @Test
    public void getCharacterAtPosition_threeWords() {
        List<String> strings = List.of("Check", "ThrEe", "WORDS");
        int position = 3;
        List<Character> expected = List.of('c', 'd', 'e');
        List<Character> actual = WordLists.getCharacterAtPosition(strings, position);
        Assert.assertEquals(String.format("The result should be \"%s\" for the input list \"%s\" and position %d\n",
                expected, strings, position), expected, actual);
    }

    @Test
    public void getCharacterAtPosition_listWithNullValue() {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add(null);
        strings.add("java");
        int position = 0;
        List<Character> expected = List.of('h', 'j');
        List<Character> actual = WordLists.getCharacterAtPosition(strings, position);
        Assert.assertEquals(String.format("The result should be \"%s\" for the input list \"%s\" and position %d\n",
                expected, strings, position), expected, actual);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void getCharacterAtPosition_outOfRange() throws StringIndexOutOfBoundsException {
        List<String> strings = List.of("short");
        int position = 5;
        WordLists.getCharacterAtPosition(strings, position);
    }

//    @Test
//    public void solution_containsHardcoding() {
//        Assert.assertEquals("You should not create a List by yourself or use loops. Use Stream API methods.\n",
//                false, resultCode.matches(NEW_LIST_REGEX));
//    }
}

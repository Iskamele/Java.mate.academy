package Daily.JavaCore.Normal.T18_CapitalizeNames;

import section00_DailyTasks.JavaCore.Normal.T18_CapitalizeNames.CapitalizeNames;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CapitalizeNamesTest {
    private static final Map<String[], String[]> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put(new String[]{"alice", "bob", "charlie"}, new String[]{"Alice", "Bob", "Charlie"});
        data.put(new String[]{"SHELDON", "LEONARD", "HOWARD", "RAJ"}, new String[]{"Sheldon", "Leonard", "Howard", "Raj"});
        data.put(new String[]{"Maria"}, new String[]{"Maria"});
        data.put(new String[]{"hARRY", "rON", "hERMIONE"}, new String[]{"Harry", "Ron", "Hermione"});
        data.put(new String[]{"thoR", "lokI"}, new String[]{"Thor", "Loki"});
        data.put(new String[]{"1ily", "0livia", "8arrie"}, new String[]{"1ily", "0livia", "8arrie"});
        data.put(new String[]{}, new String[]{});
    }

    @Test
    public void capitalizeNames_namesArray() {
        for (Map.Entry<String[], String[]> entry : data.entrySet()) {
            String[] input = entry.getKey();
            String[] expected = entry.getValue();
            String[] actual = CapitalizeNames.capitalizeNames(input);
            Assert.assertArrayEquals(String.format("Your method should return \"%s\" for the array \"%s\"",
                    Arrays.toString(expected), Arrays.toString(input)), expected, actual);
        }
    }
}

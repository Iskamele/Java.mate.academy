package Daily.JavaCore.Easy.T19_ToAlternativeCase;

import section00_DailyTasks.JavaCore.Easy.T19_ToAlternativeCase.AlternativeString;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AlternativeStringTest {
    private static final Map<String, String> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put("chicken", "CHICKEN");
        data.put("HELLO WORLD", "hello world");
        data.put("sTrInG", "StRiNg");
        data.put("1a2b3c4d5e", "1A2B3C4D5E");
        data.put("12345", "12345");
        data.put("!@#$%_", "!@#$%_");
        data.put("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", "ALTerNAtiNG CaSe <=> altERnaTIng cAsE");
        data.put("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", "altERnaTIng cAsE <=> ALTerNAtiNG CaSe");
    }

    @Test
    public void toAlternativeCase_stringToCase() {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String input = entry.getKey();
            String expected = entry.getValue();
            String actual = AlternativeString.toAlternativeCase(input);
            Assert.assertEquals(String.format("Your method should return an alternative string \"%s\" for the input string \"%s\"",
                    expected, input), expected, actual);
        }
    }
}

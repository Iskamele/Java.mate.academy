
package Daily.JavaJDBC.Easy.T08_GetPersonNames;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import section00_DailyTasks.JavaJDBC.Easy.T08_GetPersonNames.Person;
import section00_DailyTasks.JavaJDBC.Easy.T08_GetPersonNames.PersonNames;

public class PersonNamesTest {
    private static final String NEW_LIST_REGEX = ".*if.*|.*for.*|.*while.*|.*newArrayList.*|.*newLinkedList.*";
    private static String resultCode;

//  @BeforeClass
//  public static void beforeClass() {
//    resultCode = Solution.getSolution().replaceAll("\\s", "");
//  }

    @Test
    public void getPersonNames_onePersonOlderThat30() {
        Person spongebob = new Person(32, "SpongeBob");
        Assert.assertEquals(String.format("The result should be \"%s\" for the input list with one person older that 30\n",
                        List.of(spongebob.getName())), List.of("SpongeBob"),
                PersonNames.getPersonNames(List.of(spongebob)));
    }

    @Test
    public void getPersonNames_twoPersonsOlderThat30() {
        Person patrick = new Person(34, "Patrick");
        Person krabs = new Person(34, "Krabs");
        Assert.assertEquals(String.format("The result should be \"%s\" for the input list with two persons older that 30\n",
                        List.of(patrick.getName(), krabs.getName())), List.of("Patrick", "Krabs"),
                PersonNames.getPersonNames(List.of(patrick, krabs)));
    }

    @Test
    public void getPersonNames_threePersons() {
        Person squidward = new Person(50, "Squidward");
        Person gary = new Person(21, "Gary");
        Person plankton = new Person(76, "Plankton");
        Assert.assertEquals(String.format("The result should be \"%s\" for the input list with two persons older that 30 and one younger\n",
                        List.of(squidward.getName(), gary.getName(), plankton.getName())), List.of("Squidward", "Plankton"),
                PersonNames.getPersonNames(List.of(squidward, gary, plankton)));
    }

    @Test
    public void getPersonNames_emptyFilteredResult() {
        Person pearl = new Person(16, "Pearl");
        Person gary = new Person(21, "Gary");
        Assert.assertEquals(String.format("The result should be an empty list \"%s\" for the input list with persons younger that 30\n",
                        List.of(pearl.getName(), gary.getName())), List.of(),
                PersonNames.getPersonNames(List.of(pearl, gary)));
    }

    @Test
    public void getPersonNames_emptyList() {
        Assert.assertEquals(String.format("The result should be an empty list \"%s\" for the empty input list\n",
                List.of()), List.of(), PersonNames.getPersonNames(List.of()));
    }

//  @Test
//  public void solution_containsHardcoding() {
//    Assert.assertEquals("You should not create a List by yourself or use loops. Use Stream API methods.\n",
//      false, resultCode.matches(NEW_LIST_REGEX));
//  }
}

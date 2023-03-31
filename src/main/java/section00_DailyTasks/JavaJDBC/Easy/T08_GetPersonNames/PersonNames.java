package section00_DailyTasks.JavaJDBC.Easy.T08_GetPersonNames;

import java.util.List;
import java.util.stream.Collectors;

public class PersonNames {
    private static final int MINIMUM_AGE = 30;

    public static List<String> getPersonNames(List<Person> persons) {
        return persons.stream()
                .filter(p -> p.getAge() > MINIMUM_AGE)
                .map(Person::getName)
                .collect(Collectors.toList());
    }
}

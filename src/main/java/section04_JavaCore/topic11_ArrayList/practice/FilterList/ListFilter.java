package section04_JavaCore.topic11_ArrayList.practice.FilterList;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListFilter {
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 27;

    public List<Person> filter(List<Person> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        return list.stream()
                .filter(person -> person.getSex().equals("male")
                        && (person.getAge() >= MIN_AGE && person.getAge() <= MAX_AGE))
                .collect(Collectors.toList());
    }
}
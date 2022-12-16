package section04_JavaCore.topic11_ArrayList.master.FilterList;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListFilter {
  // constant for storing minimum suitable age of male person
  private static final int MIN_AGE = 18;
  // constant for storing maximum suitable age of male person
  private static final int MAX_AGE = 27;

  public List<Person> filter(List<Person> persons) {
    // if list of persons is null return empty list
    if (persons == null) {
      return Collections.emptyList();
    }
    // list for valid males
    List<Person> males = new ArrayList<>();
    // iterate through elements in list of persons
    for (Person person : persons) {
      /*
        check if person's sex is male and his age is valid
        in case if person is valid we add it to list of males
      */
      if (person.getSex().equals("male")
        && person.getAge() >= MIN_AGE && person.getAge() <= MAX_AGE) {
        males.add(person);
      }
    }
    // return all valid males
    return males;
  }
}

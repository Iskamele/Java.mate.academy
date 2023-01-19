package section04_JavaCore.topic17_SetQueueStackAndComparator.master.SortLettersAlphabetically;

import java.util.Set;
import java.util.TreeSet;

public class SortLetters {
  /*
    constant for storing value of max unique letters number
    that we can return in result
  */
  private static final int MAX_UNIQUE_LETTERS_NUMBER = 5;

  public String getUniqueCharacters(String text) {
    /*
      variable for storing unique letters
      and sorting them alphabetically
    */
    Set<Character> uniqueLetters = new TreeSet<>();
    // variable for storing text's symbols
    char[] symbols = text.toCharArray();
    // iterate through every element in array
    for (char symbol : symbols) {
      // check if symbol is a letter
      if (Character.isLetter(symbol)) {
        /*
          if it's a letter convert it to lower case form
          and add it to set
        */
        uniqueLetters.add(Character.toLowerCase(symbol));
      }
    }
    // variable to store unique letters
    StringBuilder result = new StringBuilder();
    // iterate through every element in set
    for (Character character : uniqueLetters) {
      // check if the result is filled with max number of unique letters
      if (result.length() == MAX_UNIQUE_LETTERS_NUMBER) {
        // if it's filled we break loop
        break;
      }
      // if the result isn't filled add new symbol to it
      result.append(character);
    }
    // convert result to Strign and return it
    return result.toString();
  }
}

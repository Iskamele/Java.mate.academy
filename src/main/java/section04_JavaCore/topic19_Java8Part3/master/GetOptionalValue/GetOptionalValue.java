package section04_JavaCore.topic19_Java8Part3.master.GetOptionalValue;

import java.util.Optional;

public class GetOptionalValue {
  public Integer getOptionalValue(int randomNumber) {
    Optional<Integer> optional = generateRandomOptional(randomNumber);
    /*
      in case if optional isn't empty return it
      otherwise throw NoSuchElementException
    */
    return optional.orElseThrow();
  }

  public Optional<Integer> generateRandomOptional(int randomNumber) {
    /*
      in case if random number is even return empty Optional
      otherwise return Optional of random number
    */
    return randomNumber % 2 == 0 ? Optional.empty() : Optional.of(randomNumber);
  }
}

package section04_JavaCore.topic19_Java8Part3.practice.GetOptionalValue;

import java.util.Optional;

public class GetOptionalValue {
    public Integer getOptionalValue(int randomNumber) {
        Optional<Integer> optional = generateRandomOptional(randomNumber);
        return optional.orElseThrow();
    }

    public Optional<Integer> generateRandomOptional(int randomNumber) {
        if (randomNumber % 2 != 0) {
            return Optional.of(randomNumber);
        }
        return Optional.empty();
    }
}

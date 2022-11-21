package section04_JavaCore.topic06_Exceptions.practice.UserScoreTaras;

import section04_JavaCore.topic06_Exceptions.practice.UserScore.UserNotFoundException;

import java.util.Arrays;

public class UserService {

    public int getUserScore(String[] records, String email) {
        return Arrays.stream(records)
                .map(e -> e.split(":"))
                .filter(e -> e[0].equals(email))
                .map(e -> e[1])
                .map(Integer::parseInt)
                .findAny()
                .orElseThrow(() -> new UserNotFoundException("User with given email doesn't exist"));
    }
}

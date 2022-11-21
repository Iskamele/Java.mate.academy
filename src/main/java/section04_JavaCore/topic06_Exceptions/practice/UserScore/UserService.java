package section04_JavaCore.topic06_Exceptions.practice.UserScore;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService {
    private static final Pattern intsOnly = Pattern.compile("\\d+");

//    private void test(){
//        String test = "second-user@gmail.com:20";
//        Pattern intsOnly = Pattern.compile("\\d+");
//        Matcher makeMatch = intsOnly.matcher(test);
//        makeMatch.find();
//        int answer = Integer.parseInt(makeMatch.group());
//        System.out.println(answer);
//    }


    // https://www.techiedelight.com/ru/find-occurrences-of-substring-string-java/
    // https://javarush.ru/groups/posts/isklyucheniya-java
    public int getUserScore(String[] records, String email) {
        int answer = 0;
        if (records.length == 0) {
            throw new UserNotFoundException("User with given email doesn't exist");
        }
        for (String record : records) {
            if (record.split(email, -1).length - 1 >= 1) {
                Matcher makeMatch = intsOnly.matcher(record);
                makeMatch.find();
                answer = Integer.parseInt(makeMatch.group());
                return answer;
            }


        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
package section04_JavaCore.topic06_Exceptions.practice.master.UserScore;

public class UserService {
    public int getUserScore(String[] records, String email) {
        for (String record : records) {
            String[] data = record.split(":");
            if (data[0].equals(email)) {
                return Integer.parseInt(data[1]);
            }
        }
        throw new RuntimeException("User with given email doesn't");
    }
}
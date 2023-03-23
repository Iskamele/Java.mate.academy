package section00_DailyTasks.Daily_01.Normal.T01_ValidPhoneNumber;

public class PhoneNumber {
    private static final String REGEX = "\\(\\d{3}\\) \\d{3}-\\d{4}";

    public static boolean isValid(String phoneNumber) {
        return phoneNumber.matches(REGEX);
    }
}

package section01_JavaBasics.topic06_Boolean.practice;

public class CanStayHome {
    public static void main(String[] args) {
        boolean isHoliday = true;
        boolean isVacation = true;

        boolean canStayHome = isHoliday || isVacation;
    }
}

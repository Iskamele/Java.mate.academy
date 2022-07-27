package section01_JavaBasics.topic11_Practice.practiceMaster;

public class CenturyFromYear {
    public static void main(String[] args) {
        System.out.println((getCentury(1900) == 19));
        System.out.println((getCentury(1901) == 20));
        System.out.println((getCentury(100) == 1));
        System.out.println((getCentury(1769) == 18));
    }

    public static int getCentury(int year) {
        return year % 100 == 0 ? (year / 100) : (year / 100 + 1);
    }
}
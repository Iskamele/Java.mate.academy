package section04_JavaCore.topic19_Java8Part1.theory.T09_MethodReferenceTypes.comparison;

import section04_JavaCore.topic19_Java8Part1.theory.T09_MethodReferenceTypes.model.User;
import java.util.Arrays;

public class ComparisonMain {
    public static void main(String[] args) {
        User[] people = new User[3];
        people[0] = new User("Bob");
        people[1] = new User("John");
        people[2] = new User("Alice");

        ComparisonProvider comparisonProvider = new ComparisonProvider();
        Arrays.sort(people, comparisonProvider::compareByName);

        System.out.println(Arrays.toString(people));
    }
}

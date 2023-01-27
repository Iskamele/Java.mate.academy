package section04_JavaCore.topic19_Java8Part1.theory.T09_MethodReferenceTypes.comparison;

import section04_JavaCore.topic19_Java8Part1.theory.T09_MethodReferenceTypes.model.User;

public class ComparisonProvider {
    public int compareByName(User a, User b) {
        return a.getName().compareTo(b.getName());
    }
}

package section04_JavaCore.topic19_Java8Part1.practice.FindAutoType;

import java.util.function.Function;

public class FindAutoType implements Function<Integer, AutoType> {
    private static final Integer THRESHOLD_WEIGHT = 1500;

    @Override
    public AutoType apply(Integer weight) {
        return weight < THRESHOLD_WEIGHT ? AutoType.CAR : AutoType.TRUCK;
    }
}

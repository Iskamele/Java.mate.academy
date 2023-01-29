package section04_JavaCore.topic19_Java8Part1.practice.CompareEngineVolumes;

import java.util.function.BinaryOperator;

public class CompareEngineVolumes implements BinaryOperator<Integer> {

    @Override
    public Integer apply(Integer firstPower, Integer secondPower) {
        return firstPower - secondPower;
    }
}
package section04_JavaCore.topic19_Java8Part1.practice.CompareEngineVolumes;

import java.util.function.ToIntBiFunction;

public class CompareEngineVolumes {
    ToIntBiFunction compareEngineVolumes = (o, o2) -> Integer.parseInt(o.toString()) - Integer.parseInt(o2.toString());
}

package section04_JavaCore.topic19_Java8Part1.practice.CompareEngineVolumes;

import java.util.function.ToIntBiFunction;

public class Main {
    public static void main(String[] args) {
        Integer engineOne = 100;
        Integer engineTwo = 60;

        System.out.println(compareEngineVolumes(engineOne, engineTwo));
    }

    private static int compareEngineVolumes (Object o1, Object o2) {
        ToIntBiFunction toIntBiFunction = new ToIntBiFunction() {
            @Override
            public int applyAsInt(Object o1, Object o2) {
                return Integer.parseInt(o1.toString()) - Integer.parseInt(o2.toString());
            }
        };
        //return Integer.parseInt(o1.toString()) - Integer.parseInt(o2.toString());
        return 0;
    }
}

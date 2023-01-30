package section04_JavaCore.topic19_Java8Part2.theory.T05_MapVsFlatmapExample.model;

public class Wheel {
    private String maker;
    private int size;

    public Wheel(String maker, int size) {
        this.maker = maker;
        this.size = size;
    }

    public String getMaker() {
        return maker;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "maker='" + maker + '\'' +
                ", size=" + size +
                '}';
    }
}

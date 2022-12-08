package section04_JavaCore.topic09_PatternsAndRecurstion.practice.StaticFactoryMethod;

public class Main {
    public static void main(String[] args) {
        SongOrder onlySinger = SongOrder.of("Bon Jovi");
        SongOrder singerAndSong = SongOrder.of("Bon Jovi", "It's my life");
        SongOrder singerAndNull = SongOrder.of("Bon Jovi", null);
        SongOrder onlyNull = SongOrder.of(null, null);

        System.out.println(onlySinger.toString());
        System.out.println(singerAndSong.toString());
        System.out.println(singerAndNull.toString());
        System.out.println(onlyNull.toString());
    }
}

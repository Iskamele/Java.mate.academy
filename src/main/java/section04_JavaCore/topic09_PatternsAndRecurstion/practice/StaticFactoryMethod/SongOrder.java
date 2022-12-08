package section04_JavaCore.topic09_PatternsAndRecurstion.practice.StaticFactoryMethod;

public class SongOrder {
    private String singer;
    private String songName;

    private SongOrder(String singer) {
        this.singer = singer;
    }

    private SongOrder(String singer, String songName) {
        this.singer = singer;
        this.songName = songName;
    }

    public static SongOrder of(String singer) {
        return new SongOrder(singer);
    }

    public static SongOrder of(String singer, String songName) {
        return new SongOrder(singer, songName);
    }

    @Override
    public String toString() {
        return singer == null
                ? "You haven't chosen a singer. Please make your choice)"
                : songName == null
                ? "Play any " + singer + " song"
                : "Play " + singer + " song called \"" + songName + "\"";

    /*
    if (singer == null) {
      return "You haven't chosen a singer. Please make your choice)";
    }
    if (songName == null) {
      return "Play any Bon Jovi song";
    }
    return "Play Bon Jovi song called \"It's my life\"";
     */
    }
}

package section04_JavaCore.topic09_PatternsAndRecurstion.master.StaticFactoryMethod;

public class SongOrder {
  private String singer;
  private String songName;

  /*
    constructor
    for the case if a user ordered any song of specific singer
  */
  private SongOrder(String singer) {
    this.singer = singer;
  }

  /*
    constructor
    for the case if a user ordered specific song of specific singer
  */
  private SongOrder(String singer, String songName) {
    this.singer = singer;
    this.songName = songName;
  }

  /*
    static factory method
    for the case if a user ordered any song of specific singer
  */
  public static SongOrder of(String singer) {
    return new SongOrder(singer);
  }

  /*
    static factory method
    for the case if a user ordered specific song of specific singer
  */
  public static SongOrder of(String singer, String songName) {
    return new SongOrder(singer, songName);
  }

  @Override
  public String toString() {
    // firt we check if singer is null
    return singer == null
      /*
        if singer is null (a user hasn't chosen nor singer nor song)
        we have to return "You haven't chosen a singer. Please make your choice)"
      */
      ? "You haven't chosen a singer. Please make your choice)"
      // if singer is not null we check songName for null
      : songName == null
      /*
        if songName is null (a user has chosen only specific singer)
        we have to return "Play any chosen_singer song"
      */
      ? "Play any " + singer + " song"
      /*
        If singer and song are not null (a user has choses specific song of specific singer)
        we have to return "Play chosen_singer song called chosen_song"
      */
      : "Play " + singer + " song called \"" + songName + "\"";
  }
}

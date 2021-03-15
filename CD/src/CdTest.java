public class CdTest
{
  public static void main(String[] args)
  {
    Time time1 = new Time(1, 20, 30);
    Time time2 = new Time(0, 20, 30);
    Time time3 = new Time(2, 20, 30);
    Time time4 = new Time(4, 20, 30);
    Time time5 = new Time(5, 20, 30);
    Song[] songs1 = new Song[5];
    songs1[0] = new Song("song1", "Artist1", time1);
    songs1[1] = new Song("song2", "Artist2", time2);
    songs1[2] = new Song("song3", "Artist3", time3);
    songs1[3] = new Song("song4", "Artist4", time4);
    songs1[4] = new Song("song5", "Artist 5", time5);

    Cd cd1 = new Cd("Title", "Artist", songs1);
    System.out.println(songs1[0].getLength().getTimeInSeconds());

    System.out.println("Longest:" + cd1.getLengthInSecondsOfLongestSong());
        System.out.println("Index song:"+cd1.getSong(2));
    System.out.println("Number of songs:" + cd1.getNumberOfSongs());
    System.out.println("Total length:" + cd1.TotalLength());
    System.out.println(
        "No of songs by artist:" + cd1.getNumberOfSongsByArtist("Artist1"));

    Song[] s1 = cd1.getSongsByArtist("Artist1");
    for (int i = 0; i < s1.length; i++)
    {
      if(s1[i]!=null)
      System.out.println("song by artist:"+s1[i]);
    }
    System.out.println("time longest song(sec):" + cd1.getLengthInSecondsOfLongestSong());
    System.out.println("Songs longer than:" + cd1.getNumberOfSongsLongerThan(10000));
    System.out.println("To String:" + cd1);

  }
}
